package Liste._03_List.Erweitert2;
//SaS = Search and Sort

public class List_SaS <Integer> extends List_Integer <Integer>{

    public boolean lineareSuche(String pSearch){
        int search = java.lang.Integer.valueOf(pSearch);
        toFirst();
        while (hasAccess()){
            if (java.lang.Integer.valueOf(current.getContentObject().toString()) == search){
                return true;
            }
            else next();
        }
        return false;
    }

    public boolean binaereSuche(String pSearch) {
        toFirst();
        int search = java.lang.Integer.valueOf(pSearch);
        int min = 0;
        int max = count();
        int mitte = max/2;
        for (int i = 0; i < mitte; i++) { //current muss erstmal in die Mitte kommen
            next();
        }
        while (java.lang.Integer.valueOf(current.getContentObject().toString()) != search){
            if (mitte == min && mitte == max){
                return false;
            }
            if (java.lang.Integer.valueOf(current.getContentObject().toString()) > search){
                max = mitte - 1;
            }
            else if (java.lang.Integer.valueOf(current.getContentObject().toString()) < search){
                min = mitte +1;
            }
            mitte = min + ((max-min)/2);
            for (int i = 0; i < mitte; i++) {
                next();
            }
        }
        return true;
    }

    public void sort (int[] array) {
        for (int i = 0; i < count() - 1; i++) { //Der Prozess wird so oft durchlaufen, wie der Array lang ist -1
            for (int j = 0; j < count(); j++) { //j ist die Position, die verglichen wird
                for (int k = 0; k < count(); k++) { //current muss zur aktuell kontrollierten Position kommen!
                    next();
                }
                ListNode vergleich1 = current;
                ListNode vergleich2 = getPrevious(current);
                if (java.lang.Integer.valueOf(vergleich2.getContentObject().toString()) >
                        java.lang.Integer.valueOf(vergleich1.getContentObject().toString())) {
                    ListNode temp = vergleich2;
                    vergleich2.setContentObject(vergleich1.getContentObject());
                    vergleich1.setContentObject(temp.getContentObject());
                }
            }
        }
    }
}
//Fragestellung: Wo fehlt Verweis (current)?
//Methode in Hauptklasse kopieren -> current geht weiterhin verloren


//Aufgaben: Binäre Suche
//Extraufgabe: Bubblesort oder anderes Sortierverfahren

//IN LIST_INTEGER: KORREKTUR