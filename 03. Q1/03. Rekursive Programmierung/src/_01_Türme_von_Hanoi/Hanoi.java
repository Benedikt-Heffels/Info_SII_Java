package _01_Türme_von_Hanoi;

import java.util.Scanner;
 
public class Hanoi {
  static int count = 0;
  
  public static void TvH(String a, String b, String c, int n) {
    if (n == 1) {
      System.out.println("Scheibe von " + a + " nach " + b + ".");
      count++;
    }
    else {
      TvH(a, c, b, n-1);
      TvH(a, b, c, 1);
      TvH(c, b, a, n-1);
    }    
  }

  public static int TvHAnzahl(int n) {
    if (n==1) return 1;
    else return TvHAnzahl(n-1) + 1 + TvHAnzahl(n-1);
    //um 1 kleinerer Turm wird verschoben
    //größte Scheibe wird verschoben
    //um 1 kleinerer Turm wird verschoben
  }

  public static void main (String args[]) {
    System.out.print("Wie viele Scheiben moechtest Du verschieben? ");
    Scanner scan = new Scanner(System.in);
    int z = scan.nextInt();
    TvH("A","C","B",z);
    System.out.println("Das waren insgesamt " + count + " Züge.");
    System.out.println("Die rekursive Anzahl-Funktion liefert (auch) " + TvHAnzahl(z) + " Züge.");
  }
}