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

    public boolean binaereSuche(String pSearch) { //Kann die letzten 2 Elemente der Liste nicht finden
        if (!isEmpty()) {
            int search = java.lang.Integer.valueOf(pSearch);
            int min = 0;
            int max = count() - 1;
            int mitte;
            //Exakte Berechnung der Mitte
//            String x = String.valueOf(max / 2);
//            if (java.lang.Integer.valueOf(x.charAt(x.indexOf(".") + 1)) >= 5) {
//                mitte = max / 2 + 1;
//            } else mitte = max / 2;
            mitte = max/2 +1;
            toFirst();
            for (int i = 0; i < mitte; i++) { //current muss erstmal in die Mitte kommen
                next();
            }
            while (java.lang.Integer.valueOf(current.getContentObject().toString()) != search) {
                if (java.lang.Integer.valueOf(current.getContentObject().toString()) > search) {
                    max = mitte - 1;
                } else if (java.lang.Integer.valueOf(current.getContentObject().toString()) < search) {
                    min = mitte + 1;
                }
                //Exakte Berechnung der Mitte
//                String y = String.valueOf((max - min) / 2);
//                if (java.lang.Integer.valueOf(y.charAt(y.indexOf(".") + 1)) >= 5) {
//                    mitte = min + ((max - min) / 2) + 1;
//                } else mitte = min + ((max - min) / 2);
                mitte = min + (max-min)/2 +1;
                //current => mitte
                toFirst();
                for (int i = 0; i <= mitte; i++) {
                    next();
                }
            }
            return true;
        }
        else return false;
    }

    public void bubbleSort () { //begrenzte Funktionalität
        if(!isEmpty()) {
            toFirst();
            for (int i = 0; i < count() - 1; i++) { //Der Prozess wird so oft durchlaufen, wie der Array lang ist -1
                for (int j = 0; j < count(); j++) { //j ist die Position, die verglichen wird
                    toFirst();
                    for (int k = 0; k < j; k++) { //current muss zur aktuell kontrollierten Position kommen!
                        next();
                    }
                    if (hasAccess() && current != last){
                        if (java.lang.Integer.valueOf(current.getContentObject().toString()) >
                                java.lang.Integer.valueOf(current.getNextNode().getContentObject().toString())){
                            tauscheRechts();
                        }
                    }
                }
            }
        }
    }
}


//Aufgaben: Binäre Suche
//Extraufgabe: Bubblesort oder anderes Sortierverfahren

//IN LIST_INTEGER: KORREKTUR