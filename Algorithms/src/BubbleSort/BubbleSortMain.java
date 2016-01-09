/**
 * 
 */
package BubbleSort;



/**
 * @author MaxNass
 *
 */
public class BubbleSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyBubbleSort sorter = new MyBubbleSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}

	}

}
