/**
 * 
 */
package sorting.BubbleSort;

/**
 * @author MaxNass
 *
 */
/*
 * computational complexity
 * average complexity : �(n2)
 */
public class MyBubbleSort {
	
	public void sort (int[] input) {
		
		int n = input.length;
		int temp = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=1; j<(n-i); j++) {
				if(input[j-1]>input[j]) {
					//swap the elements
					temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
				}
			}
		}
		
	}

}
