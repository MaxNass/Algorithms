/**
 * 
 */
package DataStructures;

/**
 * @author MaxNass
 *
 */
public class HashMap {

	// Count frequencies
	public static void countFrequencies(int[] arr){

		java.util.HashMap<Integer, Integer> frequencies = new java.util.HashMap<Integer, Integer>();

		for (int n :arr){

			if(frequencies.get(n) !=null) frequencies.put(n,frequencies.get(n)+1);
			else frequencies.put(n,1);
		}
		
		for (int n : frequencies.keySet()) {
			System.out.println(n+" ->"+ frequencies.get(n));
			
		}

	}	

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			int[] array = {12,3,4,12,3,5,6,6,6,6,7,3,3,12};
			countFrequencies(array);

		}

	}
