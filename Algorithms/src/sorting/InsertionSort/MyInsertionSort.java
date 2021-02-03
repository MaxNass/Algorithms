/**
 * 
 */
package sorting.InsertionSort;

/**
 * @author MaxNass
 *
 */
/*
 * computational complexity
 * Same complexity with bubble sort but a little bit faster and stable
 * average complexity : �(n2)
 */
public class MyInsertionSort {
	
	protected void sort (int[] input) {
		
		int n = input.length;
		int j,i,temp;
		printNumbers(input);
		for (i = 1; i < n; i++) {
			temp = input[i];
			j = i - 1;
			while ((j>=0) &&(input[j] > temp)) {
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = temp;
			printNumbers(input);
		}
		
		
	}
	
	private static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

}
