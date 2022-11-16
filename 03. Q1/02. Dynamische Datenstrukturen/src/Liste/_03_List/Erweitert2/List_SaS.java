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
}
//Fragestellung: Wo fehlt Verweis (current)?
//Methode in Hauptklasse kopieren -> current geht weiterhin verloren