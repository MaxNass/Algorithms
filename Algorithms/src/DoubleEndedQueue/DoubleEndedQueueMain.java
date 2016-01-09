/**
 * 
 */
package DoubleEndedQueue;

/**
 * @author MaxNass
 *
 */
public class DoubleEndedQueueMain {

	
	public static void main(String a[]){

		DoubleEndedQueue deq = new DoubleEndedQueue();
		deq.insertFront(34);
		deq.insertRear(45);
		deq.removeFront();
		deq.removeFront();
		deq.removeFront();
		deq.insertFront(21);
		deq.insertFront(98);
		deq.insertRear(5);
		deq.insertFront(43);
		deq.removeRear();
	}
}



