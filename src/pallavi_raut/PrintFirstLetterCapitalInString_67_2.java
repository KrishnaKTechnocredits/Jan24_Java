/*PRogram 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You
 */

//Assignment 67 part -2
package pallavi_raut;

public class PrintFirstLetterCapitalInString_67_2 {

	public static void main(String[] args) {
		String str = "hi hEllo how are you";
		System.out.println("Input String : " + str);
		String[] arr = str.split(" ");
		new PrintFirstLetterCapitalInString_67_2().setFirstLetterCapital(arr);
	}

	String[] setFirstLetterCapital(String[] str) {
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			char ch = str[i].charAt(0);
			String str1 = String.valueOf(ch);
			output[i] = str[i].replaceFirst(str1, str1.toUpperCase());
			System.out.print(output[i] + " ");
		}
		return output;
	}
}