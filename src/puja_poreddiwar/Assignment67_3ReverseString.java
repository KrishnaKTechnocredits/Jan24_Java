/*
 * Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam
 */

package puja_poreddiwar;

public class Assignment67_3ReverseString {

	String printReverseString(String str) {
		String temp = "";
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			temp =temp+ch;
			temp = temp.toLowerCase();
		}
		return temp;
	}
	
	void printString(String[] input) {
		String output = "";
		for(int i = 0; i<input.length;i++) {
			String str2 = printReverseString(input[i]);
			char ch1 = Character.toUpperCase(str2.charAt(0));
			String str3 = str2.replace(str2.charAt(0), ch1); 
			output += str3 + " ";
			
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		String[] arr = input.split(" ");
		new Assignment67_3ReverseString().printString(arr);
	}
}
