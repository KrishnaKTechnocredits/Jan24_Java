/*Assignment - 67_2 : 17th Feb'2024
input : Hi Hello Maulik
output : Ih Olleh Kiluam*/
package madhura_kulkarni;

public class Assignment67_2 {

	String processData(String input) {
		String output = "";
		char ch = Character.toUpperCase(input.charAt(input.length() - 1));
		output = output + ch;
		for (int i = input.length() - 2; i >= 0; i--) {
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
		String input = "Hi Hello Maulik";
		System.out.println("Input string : " + input);
		String[] str1 = input.toLowerCase().split(" ");
		new Assignment67_2().printString(str1);
	}

}
