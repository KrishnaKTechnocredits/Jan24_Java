/*Assignment - 67 : 17th Feb'2024
String str = "hi hEllO how are you";
output : Hi Hello How Are You*/

package madhura_kulkarni;

public class Assignment67_1 {

	String processData(String input) {
		String output = "";
		char ch = Character.toUpperCase(input.charAt(0));
		output = output + ch;
		for (int i = 1; i < input.length(); i++) {
			output = output + input.charAt(i);
		}
		return output;
	}

	void printString(String[] str1) {
		String finalstr = "";
		for (int i = 0; i < str1.length; i++) {
			finalstr = finalstr + processData(str1[i]) + " ";
		}
		System.out.println("Output string : " + finalstr);
	}

	public static void main(String[] args) {
		String input = "hi hEllO how are you";
		System.out.println("Input string : " + input);
		String[] str1 = input.toLowerCase().split(" ");
		new Assignment67_1().printString(str1);
	}

}
