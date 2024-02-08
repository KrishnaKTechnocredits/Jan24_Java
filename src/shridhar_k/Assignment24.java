//Print all the characters from given String having frequency 1 (print unique characters from given string) 
//[with indexOf & lastIndexOf]

package shridhar_k;

public class Assignment24 {

	void findUniqueChar(String inputString) {
		String outputString = "";
		for (int index = 0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			int num1 = inputString.indexOf(ch);
			int num2 = inputString.lastIndexOf(ch);
			if (num1 == num2) {
				outputString = outputString + ch;
			}
		}
		System.out.print("output: " + outputString);
	}

	public static void main(String[] arg) {
		Assignment24 assignment24 = new Assignment24();
		assignment24.findUniqueChar("technocredits");
	}
}
