package Liste._02_Queue;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Queue_Controller {
    @FXML private TextField tfIsEmpty;
    @FXML private TextField tfEnqueue;
    @FXML private TextField tfFront;
    @FXML private ListView listView;
    @FXML private Button btIsEmpty;
    @FXML private Button btEnqueue;
    @FXML private Button btDequeue;
    @FXML private Button btFront;

    @FXML private Button btQueue;


    private MY_Queue<String> queue;

    public void btQueue_onClick() {
        queue = new MY_Queue<String>();
        gibAus();
        btIsEmpty.setDisable(false);
        btEnqueue.setDisable(false);
        btDequeue.setDisable(false);
        btFront.setDisable(false);
    }

    public void btIsEmpty_click() {
        if (queue.isEmpty()) tfIsEmpty.setText("ja - leer!"); else tfIsEmpty.setText("nicht leer!");
    }

    public void btEnqueue_onClick() {
        queue.enqueue(tfEnqueue.getText());
        gibAus();
    }

    public void btDequeue_click() {
        queue.dequeue();
        gibAus();
    }

    public void btFront_click() {
        tfFront.setText("" + queue.front());
    }

    public void gibAus() {
        //Ausgabe über Hilfsqueue
        MY_Queue <String> queue2 = new MY_Queue<String>();
        listView.getItems().clear();
        while (!queue.isEmpty()){
            //vorderstes Element ausgeben/in listView übertragen + zwischenspeichern auf Hilfsqueue + aus queue löschen
            listView.getItems().add(queue.front());
            queue2.enqueue(queue.front());
            queue.dequeue();
        }
        //Queue rekonstruieren (und Hilfsqueue leeren)
        while (!queue2.isEmpty()){
            queue.enqueue(queue2.front());
            queue2.dequeue();
        }
    }
}
