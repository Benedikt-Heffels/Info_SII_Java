package Liste._03_List.Erweitert2;

/**
 * @author Benedikt Heffels auf Basis von Pedro Matias, Schulministerium NRW
 * @param <ContentType>
 */

public abstract class List<ContentType> {
    protected class ListNode {
        private ContentType contentObject;
        private ListNode next;

        private ListNode(ContentType pContent) {
            contentObject = pContent;
            next = null;
        }

        public ContentType getContentObject() {
            return contentObject;
        }

        public void setContentObject(ContentType pContent) {
            contentObject = pContent;
        }

        public ListNode getNextNode() {
            return next;
        }

        public void setNextNode(ListNode pNext) {
            next = pNext;
        }
    }

    ListNode first;
    ListNode last;
    ListNode current;

    /**
     * Konstruktor der Liste
     */
    public List() {
        first = null;
        last = null;
        current = null;
    }

    /**
     * Gibt es ein erstes Element?
     * @return first
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Gibt es ein aktuelles Element?
     * @return current
     */
    public boolean hasAccess() {
        return current != null;
    }

    /**
     * Das Objekt nach dem aktuellen Objekt wird zum aktuellen Objekt
     */
    public void next() {
        if (this.hasAccess()) {
            current = current.getNextNode();
        }
    }

    /**
     * Das erste Objekt wird aktuelles Objekt
     */
    public void toFirst() {
        if (!isEmpty()) {
            current = first;
        }
    }

    /**
     * Das letzte Objekt wird aktuelles Objekt
     */
    public void toLast() {
        if (!isEmpty()) {
            current = last;
        }
    }

    /**
     * Gibt den Inhalt des aktuellen Objekts zurück
     * @return <ContentType>
     */
    public ContentType getContent() {
        if (this.hasAccess()) {
            return current.getContentObject();
        } else {
            return null;
        }
    }

    /**
     * Verändert den Inhalt des aktuellen Objekts
     * @param pContent
     */
    public void setContent(ContentType pContent) {
        if (pContent != null && this.hasAccess()) {
            current.setContentObject(pContent);
        }
    }

    /**
     * Fügt ein neues Objekt vor dem aktuellen Objekt hinzu
     * @param pContent
     */
    public void insert(ContentType pContent) {
        if (pContent != null) {
            if (this.hasAccess()) {
                ListNode newNode = new ListNode(pContent);
                if (current != first) {
                    ListNode previous = this.getPrevious(current);
                    newNode.setNextNode(previous.getNextNode());
                    previous.setNextNode(newNode);
                } else {
                    newNode.setNextNode(first);
                    first = newNode;
                }
            } else {
                if (this.isEmpty()) {
                    ListNode newNode = new ListNode(pContent);
                    first = newNode;
                    last = newNode;
                }
            }
        }
    }

    /**
     * Fügt ein neues Objekt am Ende der Liste hinzu
     * @param pContent
     */
    public void append(ContentType pContent) {
        if (pContent != null) {
            if (this.isEmpty()) {
                this.insert(pContent);
            } else {
                ListNode newNode = new ListNode(pContent);
                last.setNextNode(newNode);
                last = newNode;
            }
        }
    }

    /**
     * Fügt eine neue Liste am Ende der aktuellen Liste hinzu
     * @param pList
     */
    public void concat(List<ContentType> pList) {
        if (pList != this && pList != null && !pList.isEmpty()) {
            if (this.isEmpty()) {
                this.first = pList.first;
                this.last = pList.last;
            } else {
                this.last.setNextNode(pList.first);
                this.last = pList.last;
            }
            //pList wird gelöscht (nicht in Dokumentation gefordert)
            pList.first = null;
            pList.last = null;
            pList.current = null;
        }
    }

    /**
     * Löscht das aktuelle Element
     */
    public void remove() {
        if (this.hasAccess() && !this.isEmpty()) {
            if (current == first) {
                first = first.getNextNode();
            } else {
                ListNode previous = this.getPrevious(current);
                if (current == last) {
                    last = previous;
                }
                previous.setNextNode(current.getNextNode());
            }
            ListNode temp = current.getNextNode();
            //Element wird gelöscht (nicht in Dokumentation gefordert)
            current.setContentObject(null);
            current.setNextNode(null);
            current = temp;
            if (this.isEmpty()) {
                last = null;
            }
        }
    }

    protected ListNode getPrevious(ListNode pNode) {
        if (pNode != null && pNode != first && !this.isEmpty()) {
            ListNode temp = first;
            while (temp != null && temp.getNextNode() != pNode) {
                temp = temp.getNextNode();
            }
            return temp;
        } else {
            return null;
        }
    }
}
