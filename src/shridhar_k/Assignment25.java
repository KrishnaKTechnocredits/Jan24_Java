//Print all the duplicate characters from the given String.

package shridhar_k;

public class Assignment25 {
	void findDupicate(String inputString) {
		String output = "";
		for (int index = 0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			int num1 = inputString.indexOf(ch);
			int num2 = inputString.lastIndexOf(ch);
			if (index == inputString.indexOf(ch)) {
				if (num1 != num2)
					output = output + ch;
			}
		}
		System.out.print("Output: " + output);
	}

	public static void main(String[] arg) {
		new Assignment25().findDupicate("aakanksha");
	}
}
