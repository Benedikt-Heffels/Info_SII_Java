/**
 * @author Benedikt Heffels
 * @version 1.1.1
 */

package Liste._02_Queue._B_Anwendung_Arztpraxis;

/**
 * Implementierung der Klasse AP_Queue
 * @param <ContentType>
 */

public class AP_Queue<ContentType> {
	private class QueueNode {
		private ContentType content = null;
		private QueueNode nextNode = null;

		public QueueNode(ContentType pContent) {
			content = pContent;
			nextNode = null;
		}

		public void setNext(QueueNode pNext) {
			nextNode = pNext;
		}

		public QueueNode getNext() {
			return nextNode;
		}

		public ContentType getContent() {
			return content;
		}
	}
	
	private QueueNode head;
	private QueueNode tail;

	/**
	 * Konstruktor der Klasse AP_Queue
	 */

	public AP_Queue() {
		head = null;
		tail = null;
	}

	/**
	 * @return head: Existiert ein erstes Element?
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Fügt ein Element am Ende der Queue hinzu
	 * @param pContent
	 */

	public void enqueue(ContentType pContent) {
		if (pContent != null) {
			QueueNode newNode = new QueueNode(pContent);
			if (this.isEmpty()) {
				head = newNode;
				tail = newNode;
			} else {
				tail.setNext(newNode);
				tail = newNode;
			}
		}
	}

	/**
	 * Entfernt das erste Element
	 */

	public void dequeue() {
		if (!this.isEmpty()) {
			head = head.getNext();
			if (this.isEmpty()) {
				head = null;
				tail = null;
			}
		}
	}

	/**
	 * Fügt ein neues Element am Anfang der Queue hinzu
	 * @param pContent
	 */

	public void frontEnqueue(ContentType pContent){ //Beugung der Queue-Regeln dür Anwendung
		QueueNode newNode = new QueueNode(pContent);
		if (this.isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	/**
	 *
	 * @return head.getContent(): Gibt Inhalt des ersten Objekts zurück
	 */
	public ContentType front() {
		if (this.isEmpty()) {
			return null;
		} else {
			return head.getContent();
		}
	}
}
