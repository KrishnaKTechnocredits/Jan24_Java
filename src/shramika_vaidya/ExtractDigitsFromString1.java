package shramika_vaidya;

public class ExtractDigitsFromString1 {

	int getDigitFromString(String str) {
		String str1 = "0";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				str1 += ch;
			}
		}
		return Integer.parseInt(str1);
	}

	void PrintDigitFromStringArray(String[] output) {
		int[] number = new int[output.length];
		for (int index = 0; index < output.length; index++)
			number[index] = getDigitFromString(output[index]);
		System.out.print("{" + number[0] + "," + number[1] + "," + number[2] + "," + number[3] + "}");
	}

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "pratham5es6h", "a4ksha7y", "padmaja" };
		ExtractDigitsFromString1 extractDigitsFromString1 = new ExtractDigitsFromString1();
		extractDigitsFromString1.PrintDigitFromStringArray(arr);
	}
}
