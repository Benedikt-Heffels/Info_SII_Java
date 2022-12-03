package Liste._03_List.Erweitert_Integer;
//SaS = Search and Sort

public class List_SaS extends List_Integer {
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

    public boolean binaereSuche(int pSearch) {
        if (!isEmpty()) {
            int min = 1;
            int max = count();
            int mitte;

            while ((min <= max)) {
                mitte = (min+max)/2;
                toFirst();
                for (int i = 1; i < mitte; i++) {
                    next();
                }
                if (getContent() > pSearch) {
                    max = mitte - 1;
                } else if (getContent() < pSearch) {
                    min = mitte + 1;
                } else return true;
            }
        }
        current = null;
        return false;
    }

    public void bubbleSort () { //begrenzte Funktionalität: Dauerhafter Absturz
        if(!isEmpty()) {
            for (int i = 0; i < count() - 1; i++) { //Der Prozess wird so oft durchlaufen, wie der Array lang ist -1
                toFirst();
                for (int j = 0; j < count() - i; j++) { //j ist die Position, die verglichen wird
                    if (getContent() > current.getNextNode().getContentObject()){
                        tauscheRechts();
                    }
                    else next();
                }
            }
        }
    }
}