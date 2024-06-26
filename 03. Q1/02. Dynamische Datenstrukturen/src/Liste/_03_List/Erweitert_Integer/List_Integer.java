package Liste._03_List.Erweitert_Integer;

public class List_Integer extends List_Erweitert <Integer> {

    public Integer toMax(){
        if (!isEmpty()) {
            current = first;
            int maximal = Integer.valueOf(first.getContentObject().toString());
            //int pos = 0;
            ListNode temp = current;
            while (!current.equals(last)) {
                next();
                //pos++;
                int aktuell = Integer.valueOf(current.getContentObject().toString());
                if (aktuell > maximal) {
                    maximal = aktuell;
                    temp = current;
                } //komplette Liste wird durchlaufen -> pos geht verloren
            }
            current = temp;
//            current = first;
//            for (int i = 0; i < pos; i++) {
//                next(); //Das größte Element soll current werden (nette Erweiterung)
//            }
            return maximal;
        }
        else return null;
    }

    public Double average() {
        int summeInt = 0;
        int anzahlInt = 0;
        ListNode temp = current;
        if (!isEmpty()){
            current = first;
            summeInt = summeInt + Integer.valueOf(current.getContentObject().toString());
            anzahlInt ++;
            while (!current.equals(last)){
                next();
                summeInt = summeInt += Integer.valueOf(current.getContentObject().toString());
                anzahlInt ++;
            }
            current = temp;
            return (Double.valueOf(summeInt/anzahlInt));
        }
        else return null;
    }

    protected boolean isNumeric (){ //Methode überprüft, ob eingegebene Liste eine Zahl ist
        boolean isNumeric;
        try {
            if (hasAccess()) toFirst();
            while (!current.equals(last)){
                Double.parseDouble(current.getContentObject().toString()); //Wenn das einsetzen nicht klappt, also Eingabe keine Zahl: NumberFormatException
                next();
            }
            isNumeric = true;
        } catch(NumberFormatException exception){
            isNumeric = false;
        }
        return isNumeric;
    }

    /*
    Alternativer Ansatz für String-Liste: Jede Eingabe zu Integer casten und prüfen, ob es eine Zahl ist
     */
}
