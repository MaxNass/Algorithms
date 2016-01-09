/**
 * 
 */
package QuickSort;

/**
 * @author MaxNass
 *
 */
/*
 * computational complexity
 * Average complexity : �(nlogn) 
 * sorted list : �(n2) 
 * Choosing the appropriate pivot, as for example the median element is fundamental
 * for avoiding the drastically reduced performance of �(n2)
 */
public class MyQuickSort {
	
	private int array[];
	private int length;
	
	public void sort( int[] inputArr) {
		
		if (inputArr== null || inputArr.length == 0) {
			return; 
		}
		this.array = inputArr;
		length = inputArr.length;
		quicksort(0,length-1);
	}
	
	private void quicksort (int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, pivot = middle index number
		int pivot = array[lowerIndex + (higherIndex-lowerIndex)/2];
		// Divide into two arrays
		while (i<=j) {
			/**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
			while (array[i] < pivot) {
				i++;
			}
			
			while (array[j] > pivot) {
				j--;
			}
			
			if (i<=j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}	
		}
		
		// call quicksort method recursively
		if (lowerIndex < j) {
			quicksort(lowerIndex,j);
		}
		if(i<higherIndex) {
			quicksort(i,higherIndex);
		}
	}
	
	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
 
}
