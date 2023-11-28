//Compiliere und korrigiere schrittweise (lass dabei die fehlerhaften Zeilen - auskommentiert - stehen)!
//Versuche dann (am Ende) alle gefundenen Fehler nach gewissen, Dir sinnvoll erscheinenden  Kriterien zu ordnen!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class MinSort_Korrigiert extends Frame {
    // Anfang Attribute
    private NumberField numberField1 = new NumberField();
    private NumberField numberField2 = new NumberField();
    private NumberField numberField3 = new NumberField();
    private NumberField numberField4 = new NumberField();
    private NumberField numberField5 = new NumberField();
    private Button button1 = new Button();
    private Timer timer1 = new Timer(500, null);
    private Label label1 = new Label();
    private Button button2 = new Button();
    int x, zweiY, paragraph; //"identifier" expected: § kein Variablenname, Variablennamen muss mit Buchstaben beginnen (nicht 2y)
    // Ende Attribute

    public minsort_korrigiert(String title) { // <- METHODENAUFRUF LÖST NOCH FEHLER AUS
        // Frame-Initialisierung
        super(title);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                dispose();
            }
        });
        int frameWidth = 300;
        int frameHeight = 277;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        Panel cp = new Panel(null);
        add(cp);
        // Anfang Komponenten

        numberField1.setBounds(32, 24, 35, 36); //Die numberField-Methode/Variable existiert in unserem Java nicht mehr, soll daher als korrekt betrachtet werden.
        numberField1.setText("");
        numberField1.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(numberField1);
        numberField2.setBounds(80, 24, 35, 36);
        numberField2.setText("");
        numberField2.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(numberField2);
        numberField3.setBounds(128, 24, 35, 36);
        numberField3.setText("");
        numberField3.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(numberField3);
        numberField4.setBounds(176, 24, 35, 36);
        numberField4.setText("");
        numberField4.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(numberField4);
        numberField5.setBounds(224, 24, 35, 36);
        numberField5.setText("");
        numberField5.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(numberField5);
        button1.setBounds(144, 80, 99, 33);
        button1.setLabel("sortiere");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button1_ActionPerformed(evt);
            }
        });
        button1.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(button1);
        timer1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                timer1_ActionPerformed(evt);
            }
        });
        timer1.setRepeats(true);
        timer1.setCoalesce(false);
        timer1.setLogTimers(false);
        label1.setBounds(8, 192, 262, 29);
        label1.setText("sortiert: ");
        label1.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(label1);
        setTitle("MinSort");
        button2.setBounds(32, 80, 99, 33);
        button2.setLabel("fülle");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button2_ActionPerformed(evt);
            }
        });
        button2.setFont(new Font("Dialog", Font.PLAIN, 22));
        cp.add(button2);
        // Ende Komponenten
        setVisible(true);
    } // end of public minsort

    // Anfang Methoden

    public static void main(String[] args) {
        new minsort_korrigiert("minsort");
    } // end of main

    public static int[] MinSort(int[] r) { // r muss deklariert werden, nicht als Teil der Klammer (']' expected, identifier expected)
        int i = 0; // booleans haben nur richtig/falsch, hier also int notwendig
        int n = r.length - 1; //Klasse "integer" existiert nicht -> stattdessen: int
        int j, temp;
        int min; //Um auch außerhalb der while-Schleife auf min zugreifen zu können, muss diese vorher definiert werden
        while (i<n) { //Um die Bedingung müssen Klammern
            min = i; //';' expected; min muss deklariert werden (als int: 'not a statement')
            j = i + 1; //"==" falsch, da es sich um Zuweisung statt Abfrage handelt
            while (j <= n) {
                if (r[j] < r[min]) { //Schleife der if-Bedingung wurde nie geöffnet
                    min = j; //"Min" nicht als Variable definiert, stattdessen "min"
                } // end of if
                j ++; //Ein reines "j+" existiert nicht. Stattdessen "j++" als Erhöhung um 1
            } // end of while
            temp = r[i]; //"tem" existiert nicht. hier ist wahrscheinlich die Variable "temp" gemeint.
            r[i] = r[min];
            r[min] = temp;
            i = i + 1;
        } // end of while
        return r;
    }

    public void button1_ActionPerformed(ActionEvent evt) {
        int x = 130, y = 80;
        String z = "dreißig"; //Definierung der Variablen notwendig
        timer1.start(); //Hier wird mit einer Variable eine Funktion aufgerufen, das setzt einen Punkt voraus
        label1.setText("sortiert: "); //Staht der Definiton über "0" muss hier die methodische Definition angewendet werden
    } //in der nächsten Zeile beginnt eine neue Methode, davor muss die vorherige geschlossen werden.

        public void timer1_ActionPerformed(ActionEvent evt) {
            x = x + 10;
            zweiY = zweiY + 10; //Hier und in der folgenden Zeile wird eine bereits deklarierte Variable vorausgesetzt. Die einzigen passenden aus dem Klassenkopf sind zweiY und paragraph
            paragraph = paragraph + 10;
            if (x == 160) { //Im if-Kopf: ==
                timer1.stop(); //"timer1.stop" ist ein Methodenaufruf, gekennzeichnet durch die Klammern
                int[] a = new int[5]; //Deklarationstyp links und rechts des Gleichheitszeichens müssen identisch sein
                a[0] = new Integer(numberField1.getText());
                a[1] = new Integer(numberField2.getText()); //Klassennamen schreibt man groß, Methoden hingegen klein ("GETText")
                a[2] = Integer(numberField3.getText());
                a[3] = new Integer(numberField4.setText());
                a[4] = new String(numberField5.getText());
                MinSort_Korrigiert(); //<- HIER STIMMT DER METHODENAUFRUF NOCH NICHT GANZ, title?
                for (int i=0;i<5;i++) {
                    label1.setText(label1.getText() + a[i] + ", ");
                }
            }
            button1.setBackground(new Color(x+70, zweiY-30, paragraph));
            button1.setLocation(x, zweiY); //Die Location ist nur zweidimensional, eine Variable muss also raus (vorher: "button1.setLocation(x,zweiY,paragraph)")
        }

        public void button2_ActionPerformed(ActionEvent evt) {
            Random rand = new Random();
            int a = rand.nextInt(90); //"#" ist kein gültiges Variablenzeichen, logisch ist hier stattdessen "a"
            numberField1.setText("" + a); //"numberField1" (richtig) und "numberfield1" sind nicht identisch
            a = rand.nextInt(90); //Die zugewiesene Variable muss am Anfang stehen
            numberField2.setText("" + a);
            a = rand.nextInt(90);
            numberField3.setText(a); //Die "setText"-Methode benötigt eine String-Eingabe, daher wird hier auf die "" wie sonst auch zurückgegriffen
            a = rand.nextInt(90); //Es fehlte der notwendige "nextInt"-Befehl
            numberField4.setText(""+a);
            a = rand.nextInt(90);
            numberField5.setText(""+a); //Hier wird ein "+" statt einem "-" benötigt.
        }
    }

