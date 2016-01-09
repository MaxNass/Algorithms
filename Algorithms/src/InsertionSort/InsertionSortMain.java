/**
 * 
 */
package InsertionSort;

/**
 * @author MaxNass
 *
 */
public class InsertionSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyInsertionSort sorter = new MyInsertionSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		sorter.sort(input);
		/*for (int i : input) {
			System.out.print(i + " ");
		}*/

	}

}
