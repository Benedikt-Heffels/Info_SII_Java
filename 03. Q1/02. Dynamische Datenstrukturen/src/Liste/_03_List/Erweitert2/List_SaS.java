package Liste._03_List.Erweitert2;
//SaS = Search and Sort

public class List_SaS extends List_Integer <Integer>{
    public boolean lineareSuche(String pSearch){
        int search = Integer.valueOf(pSearch);
        toFirst();
        while (hasAccess()){
            if (Integer.valueOf(current.getContentObject().toString()) == search){
                return true;
            }
            else next();
        }
        return false;
    }

    public boolean binaereSuche(int pSearch) { //Kann die letzten 2 Elemente der Liste nicht finden
        if (!isEmpty()) {
            int min = 1;
            int max = count();
            int mitte;

            while (getContent() != pSearch && (min <= max)) {
                mitte = (min+max)/2;
                toFirst();
                for (int i = 0; i < mitte; i++) {
                    next();
                }
                if (getContent() > pSearch) {
                    max = mitte - 1;
                } else if (getContent() < pSearch) {
                    min = mitte + 1;
                } else return true;
            }
            //Problem: Erstes und letztes Element können nicht angesprochen werden! -> Sonderprüfung!
            toFirst();
            if (getContent() == pSearch){
                return true;
            }
            toLast();
            if (getContent() == pSearch){
                return true;
            }
        }
        current = null;
        return false;
        //Zahlen größer als letztes Element (z.B. 502 bei letztes Ele 501) führen zu Exception
    }

    public void bubbleSort () { //begrenzte Funktionalität: Absturz, wenn letztes Element kleiner als vorletztes
        if(!isEmpty()) {
            toFirst();
            for (int i = 0; i < count() - 1; i++) { //Der Prozess wird so oft durchlaufen, wie der Array lang ist -1
                for (int j = 0; j < count(); j++) { //j ist die Position, die verglichen wird
                    toFirst();
                    for (int k = 0; k < j; k++) { //current muss zur aktuell kontrollierten Position kommen!
                        next();
                    }
                    if (hasAccess() && current != last){
                        if (Integer.valueOf(current.getContentObject().toString()) >
                                Integer.valueOf(current.getNextNode().getContentObject().toString())){
                            tauscheRechts();
                        }
                    }
                }
            }
        }
    }
}