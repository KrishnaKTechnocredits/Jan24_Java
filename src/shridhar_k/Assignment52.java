/*
 * String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
   output : {134,56,47,0}
 */

package shridhar_k;

public class Assignment52 {
	
	private int getNumberFromString(String inpString) {
		String num = "0";
		for(int i =0 ; i< inpString.length(); i++) {
			char ch = inpString.charAt(i);
			if(Character.isDigit(ch)) {
				num = num + ch;
			}
		}
		return Integer.parseInt(num);
	}
	
	private int[] getNumericArr(String[] inpArr) {
		int[] arrInt = new int[inpArr.length];
		for(int i =0; i < inpArr.length; i++) {
			arrInt[i] = getNumberFromString(inpArr[i]);
		}
		return arrInt;
	}
	
	void printNumericValueOfStringInArr(String[] inpArr) {
		int[] numArr = getNumericArr(inpArr);
		System.out.print( "{ ");
		for(int i =0; i < numArr.length; i++) {
			System.out.print( numArr[i] + ", ");
		}
		System.out.print( " }");
	}
	
	public static void main(String[] arg) {
		String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
		Assignment52 assignment52 = new Assignment52();
		assignment52.printNumericValueOfStringInArr(arr);
	}
}
