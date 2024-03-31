/*
 * Assignment - 94 : 25th March'2024 [18-20 mins] 
Input- Kajol is Working in Roche
Output- Roche in Working is Kajol
 */
package puja_poreddiwar;

public class Assignment94 {

	void printReverseString(String[] str) {
		String output = "";
		for (int i = str.length - 1; i >= 0; i--) {
			output += str[i] + " ";
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String str = "Kajol is Working in Roche";
		String[] str1 = str.split(" ");
		new Assignment94().printReverseString(str1);
	}

}
