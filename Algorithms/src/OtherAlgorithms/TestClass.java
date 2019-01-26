/**
 * 
 */
package OtherAlgorithms;

/**
 * @author MaxNass
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		int[] tab = new int[3];
		for (int i = 0; i< tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		int i = 20 % 3;
		System.out.println(i);
		
		String sss = " Hello World ".trim();
		System.out.println("sss :" + sss  + ".");
		
		int numbers[] = new int[10];
		for (int ii = 0; ii<numbers.length;ii++) {
			numbers[ii]= ii+ 5;
			System.out.println(numbers[ii]);
		}
		
		int number = 1;
		number(number);
		System.out.println("number : " + number);
		
		//throw new RuntimeException("1");

		} catch (RuntimeException e ) {
			//System.out.println("toto ");
			//throw new RuntimeException("2");
		} finally {
			System.out.println("titi ");
		}
	}
	
	public static int number(int number) {
		number = number +1 ;
		return number;
	}

}
