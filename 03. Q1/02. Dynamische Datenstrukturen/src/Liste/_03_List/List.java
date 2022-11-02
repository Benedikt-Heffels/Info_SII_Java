package Liste._03_List;

public class List<ContentType> {
    private class ListNode {
        private ContentType contentType;
        private ListNode next;

        private ListNode(ContentType pContent) {
            contentType = pContent;
            next = null;
        }

        public ContentType getContentType() {
            return contentType;
        }

        public void setContentType(ContentType pContent) {
            contentType = pContent;
        }

        public ListNode getNextNode() {
            return this.next;
        }

        public void setNextNode(ListNode pNext) {
            this.next = pNext;
        }
    }

    ListNode first;
    ListNode last;
    ListNode current;

    public List() {
        first = null;
        last = null;
        current = null;
    }

    public boolean isEmpty() {
        if (last == null && first == null) { // Neue Objekte kann man an beiden Enden hinzufügen
            return true;
        }
        else{
            return false;
        }

    }

    public boolean hasAccess() { //Wenn es ein aktuelles Objekt gibt = true
        if (current != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void next() {
        if (!isEmpty() && current != null && current != last){
            current = current.getNextNode();
        }
        else current = null;
    }

    public void toFirst() {
        if (!isEmpty()){
            current = first;
        }
    }

    public void toLast() {
        if (!isEmpty()){
            current = last;
        }
    }

    public ContentType getContent() {
        if (hasAccess()){
            return current.getContentType();
        }
        else {
            return null;
        }
    }

    public void setContent(ContentType pContent) {
        if (hasAccess() && pContent != null){
            current.setContentType(pContent);
        }
    }

    public void append(ContentType pContent) {
        ListNode newNode = new ListNode(pContent);
        if (pContent != null) {
            if (isEmpty()) {
                last.setNextNode(newNode);
                last = newNode;
            }
            else {
                last = newNode;
                current = null;
            }
        }
    }

    public void insert(ContentType pContent) {
        ListNode newNode = new ListNode(pContent);
        if (!hasAccess() && !isEmpty() || pContent == null) {
            if (hasAccess() == true) {
                newNode.setNextNode(current);
            } else if (isEmpty()) {
                last = newNode;
                current = null;
            }
        }
    }

    public void concat(List<ContentType> pList) {
        //if (!this)
    }

    public void remove() {
        if (hasAccess()){
            //ListNode pListNode = new ListNode(current.getContentType());

        }
    }

    //Zusatz-Methode - nicht in Dokumentation enthalten,
    //aber sehr hilfreich für andere Methoden
    private ListNode getPrevious(ListNode pNode) {
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
