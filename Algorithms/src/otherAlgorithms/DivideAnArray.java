/**
 * 
 */
package otherAlgorithms;

import java.util.ArrayList;

/**
 * @author MaxNass
 *
 */
public class DivideAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab = {1,5,7,3,12};
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		int res = 0;
		int res_temp = 0;
		for (int i=0; i<tab.length;i++) {
			res = res + tab[i];
		}
		System.out.println("R�sultat = " + res);
		
		for(int i=0; i<tab.length;i++) {
			res_temp = res_temp + tab[i];
			if(res_temp > res/2) {
				int pos = verifierProximite(tab,i, res_temp,res);
				System.out.println("position=" + pos);
				remplirTableau(tab, tab1, tab2, pos);
				break;
			}
			
		}
		
		System.out.println(tab1);
		System.out.println(tab2);

	}
	
	private static int verifierProximite(int[] tab, int i,int res_temp, int res) {
		int tmp = res_temp - tab[i];
		System.out.println("tmp=" + tmp);
		if (Math.abs(res_temp - res/2) > Math.abs(tmp - res/2)) {
			return i-1;
		} else {	
			return i;
		}
		
		
	}

	/**
	 * fill in the tabs 
	 * @param tab
	 * @param tab1
	 * @param tab2, int position
	 */
	public static void remplirTableau (int[] tab,ArrayList<Integer> tab1,ArrayList<Integer> tab2, int position ) {
		int i = 0;
		while (i<=position) {
			tab1.add(tab[i]);
			i++;
		}
		for (int j=i;j<tab.length;j++){
			tab2.add(tab[j]);
		}
	}

}
