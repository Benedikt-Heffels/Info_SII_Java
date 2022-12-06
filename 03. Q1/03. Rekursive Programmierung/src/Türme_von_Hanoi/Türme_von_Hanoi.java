package Türme_von_Hanoi;

public class Türme_von_Hanoi {

	public Türme_von_Hanoi() {
		TurmA = new TVH_Stack <String>();
		TurmB = new TVH_Stack <String>();
		TurmC = new TVH_Stack <String>();
		anzahlScheiben = 0;
		running = false;
	}

	public TVH_Stack <String> TurmA;
	public TVH_Stack <String> TurmB;
	public TVH_Stack <String> TurmC;
	private boolean running;
	private int anzahlScheiben;

	public void setAnzahlScheiben(int anzahlScheiben) {
		this.anzahlScheiben = anzahlScheiben;
		scheibenHinzufügen(this.anzahlScheiben);
	}

	protected void scheibenHinzufügen(int anzahlScheiben) {
        for (int i = anzahlScheiben; i >= 0 ; i--) {
			TurmA.push(String.valueOf(i));
        }
	}

	public boolean isRunning() {
		return running;
	}


	public void move(int pAnzahlScheiben, String von, String nach, String über, boolean sourceNext) { //sourceNext == true: Aufruf aus "NEXT", sonst Aufruf aus "AUTOMATIC"
		running = true;
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

			TVH_Controller.gibAus(sourceNext);
			if (!sourceNext){
				try {
					Thread.sleep(10000);
				} catch (Exception e){
					System.out.println("Technische Probleme");
				}
			}
		}
		else {
			running = true;
			move(pAnzahlScheiben - 1, von, über, nach, sourceNext);
			running = true;
			move(1, von, nach, über, sourceNext);
			running = true;
			move(pAnzahlScheiben-1, über, nach, von, sourceNext);
			running = false;
		}
	}


}

