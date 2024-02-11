//WAP to find count of digits in a given String.
//String str = "H2i H3el4lo P4un2e5";
//output : 6
package priya_t;

public class Assignment50_CountDigitFromString {

	int getCountDigitfromstring(String input) {
		String output = " ";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				output = output + ch;
				count++;
			}
		}
		System.out.println("Digit Count is " + count + " for given String");
		return count = count + 1;
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		Assignment50_CountDigitFromString obj = new Assignment50_CountDigitFromString();
		obj.getCountDigitfromstring(str);
	}
}
