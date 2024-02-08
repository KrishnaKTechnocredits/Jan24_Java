package samiksha;

public class VowelsDigit {

	void printNamesWithVowelsDigit(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i].toLowerCase();
			char ch = temp.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				for (int index = 0; index < temp.length(); index++) {
					char intchar = temp.charAt(index);
					if (Character.isDigit(intchar)) {
						System.out.println(temp);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new VowelsDigit().printNamesWithVowelsDigit(input);
	}
}
