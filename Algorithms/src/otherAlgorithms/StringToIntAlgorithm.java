/**
 * 
 */
package otherAlgorithms;

/**
 * @author MaxNass
 *
 */
public class StringToIntAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str ="11213";
		
		int i = 0;
	    int num = 0;
	    boolean isNeg = false;

	    //Check for negative sign; if it's there, set the isNeg flag
	    if (str.charAt(0) == '-') {
	        isNeg = true;
	        i = 1;
	    }

	    //Process each character of the string;
	    while( i < str.length()) {
	        num *= 10;
	        System.out.println("i="+ i);
	        System.out.println("num1=" + num);
	        num += str.charAt(i) - '0'; //Minus the ASCII code of '0' to get the value of the charAt(i++).
	        System.out.println("num2=" + num);
	        System.out.println("----------------------");
	        i++;
	    }

	    if (isNeg)
	        num = -num;
	    
	    System.out.println("The integer result is " + num);
	    

	}

}
