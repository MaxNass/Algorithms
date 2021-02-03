/**
 * 
 */
package sorting.mergeSort;

/**
 * @author MaxNass
 *
 */
public class MergeSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyMergeSort sorter = new MyMergeSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		double debut = System.currentTimeMillis();
		sorter.sort(input);
		double fin = System.currentTimeMillis();
		System.out.println("temps mis = " + (fin-debut) + "ms");
		for (int i : input) {
			System.out.print(i + " ");
		}

	}

}
