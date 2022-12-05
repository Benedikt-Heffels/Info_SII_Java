package Türme_von_Hanoi;

public class Türme_von_Hanoi {

	public Türme_von_Hanoi(int anzahlScheiben) {
		TurmA = new TVH_Stack();
		TurmB = new TVH_Stack();
		TurmC = new TVH_Stack();
		scheibeHinzufügen(anzahlScheiben);
	}

	private TVH_Stack <Integer> TurmA;
	private TVH_Stack <Integer> TurmB;
	private TVH_Stack <Integer> TurmC;

	protected void scheibenHinzufügen(int anzahlScheiben) {
		for (int i = anzahlScheiben, i <=0, i--) {
			TurmA.push(i)
		}
	}

	public void move(S
}

