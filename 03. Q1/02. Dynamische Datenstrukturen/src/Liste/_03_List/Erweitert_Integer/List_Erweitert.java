package Liste._03_List.Erweitert_Integer;

public class List_Erweitert <ContentType> extends List <ContentType> {

    /**
     * Tauscht das aktuelle Element mit dem darauffolgenden Element.
     */
    public void tauscheRechts(){
        if (hasAccess()){
            if (current != last){
                //insert(current.getNextNode().getContentObject());
                ListNode temp = current.getNextNode();
                current.setNextNode(temp.getNextNode());
                temp.setNextNode(current);
                if (current == first){
                    first = temp;
                }
                else {
                    current = getPrevious(current);
                    current.setNextNode(temp);
                    current = temp.getNextNode();
                }
                if (current == last){
                    last = last.getNextNode();
                }
            }

        }
    }


    /**
     * Die Liste wird komplett umgedreht (letztes Element -> erstes Element, erstes Element -> letztes Element)
     */
    public void dreheUm(){
        if (!isEmpty()){
            List<ContentType> list2 = new List<ContentType>(){};
            while (!isEmpty()) {
                this.current = last;
                list2.append(this.last.getContentObject());
                this.remove();
            }
            this.concat(list2);
        }
    }

    /**
     * Zählt die Elemente in der Liste
     * @return anzahlElemente
     */
    public int count(){
        int anzahlElemente = 1;
        toFirst();
        while (current != last){
            next();
            anzahlElemente +=1;
        }
        return anzahlElemente;
    }

}
