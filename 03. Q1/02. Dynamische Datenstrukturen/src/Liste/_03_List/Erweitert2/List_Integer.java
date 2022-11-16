package Liste._03_List.Erweitert2;

public class List_Integer <Integer> extends List_Erweitert <Integer> {

    public java.lang.Integer toMax(){
        if (!isEmpty()) {
            current = first;
            int maximal = java.lang.Integer.valueOf(first.getContentObject().toString());
            int pos = 0;
            while (!current.equals(last)) {
                next();
                pos++;
                int aktuell = java.lang.Integer.valueOf(current.getContentObject().toString());
                if (aktuell > maximal) {
                    maximal = aktuell;
                }
            }
            current = first;
            for (int i = 0; i < pos; i++) {
                next(); //Das größte Element soll current werden (nette Erweiterung)
            }
            return maximal;
        }
        else return null;
    }

    public Double average() {
        int summeInt = 0;
        int anzahlInt = 0;
        if (!isEmpty()){
            current = first;
            summeInt = summeInt + java.lang.Integer.valueOf(current.getContentObject().toString());
            anzahlInt ++;
            while (!current.equals(last)){
                next();
                summeInt = summeInt += java.lang.Integer.valueOf(current.getContentObject().toString());
                anzahlInt ++;
            }
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
