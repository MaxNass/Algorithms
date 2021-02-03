/**
 * 
 */
package sorting.mergeSort;

/**
 * @author MaxNass
 *
 */
/*
 * computational complexity
 * Average complexity : �(nlogn) 
 */
public class MyMergeSort {
	
	private int[] array;
	private int[] tempMergeArr;
	private int lenght;
	
	public void sort (int inputArr[]) {
		this.array = inputArr;
		this.lenght = inputArr.length;
		this.tempMergeArr = new int[lenght];
		doMergeSort(0, lenght-1);
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex) {
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex-lowerIndex)/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle + 1 , higherIndex);
			mergeParts(lowerIndex, middle, higherIndex);
		}
			
	}
	
	private void mergeParts (int lowerIndex, int middle, int higherIndex) {
		
		for (int i = lowerIndex; i<=higherIndex; i++) {
			tempMergeArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		
		while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
		
	}

}
