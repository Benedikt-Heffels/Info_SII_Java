package Türme_von_Hanoi;

public class Türme_von_Hanoi {

	public Türme_von_Hanoi(int anzahlScheiben) {
		TurmA = new TVH_Stack <String>();
		TurmB = new TVH_Stack <String>();
		TurmC = new TVH_Stack <String>();
		scheibenHinzufügen(anzahlScheiben);
	}

	private TVH_Stack <String> TurmA;
	private TVH_Stack <String> TurmB;
	private TVH_Stack <String> TurmC;

	protected void scheibenHinzufügen(int anzahlScheiben) {
        for (int i = anzahlScheiben; i >= 0 ; i--) {
			TurmA.push(String.valueOf(i));
        }
	}

	public void move(int pAnzahlScheiben, String von, String nach, String über) {
		if (pAnzahlScheiben == 1){
			System.out.println("Bewege eine Scheibe von Turm " + von + " zum Turm " + nach + ".");
			//Überschreiben der Stacks -> Bessere Ausgabe
			if (von.equals("A") && nach.equals("B")){
				String element = TurmA.top();
				TurmA.pop();
				TurmB.push(element);
			}
			else if (von.equals("A") && nach.equals("C")){
				String element = TurmA.top();
				TurmA.pop();
				TurmC.push(element);
			}
			else if (von.equals("B") && nach.equals("A")){
				String element = TurmB.top();
				TurmB.pop();
				TurmA.push(element);
			}
			else if (von.equals("B") && nach.equals("C")){
				String element = TurmB.top();
				TurmB.pop();
				TurmC.push(element);
			}
			else if (von.equals("C") && nach.equals("A")){
				String element = TurmC.top();
				TurmC.pop();
				TurmA.push(element);
			}
			else if (von.equals("C") && nach.equals("B")){
				String element = TurmC.top();
				TurmC.pop();
				TurmA.push(element);
			}
		}
		else {
			move(pAnzahlScheiben - 1, von, über, nach);
			move(1, von, nach, über);
			move(pAnzahlScheiben-1, über, nach, von);
		}
	}


}

