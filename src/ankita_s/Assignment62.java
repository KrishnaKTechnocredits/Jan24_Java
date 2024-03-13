package ankita_s;

public class Assignment62 {
	void getSumOfAllNumInString(String str) {

		double sum = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (str.charAt(i + 1) == '.') {
					temp = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1))
							+ Character.toString(str.charAt(i + 2));
					sum = sum + Double.parseDouble(temp);
				} else {
					sum = sum + Character.getNumericValue(str.charAt(i));
				}

			}
		}
		System.out.println("Sum of all the numbers: " + sum);
	}

	public static void main(String[] args) {
		String input = "te3ch4.5noc7red8.1its";
		Assignment62 ass62 = new Assignment62();
		ass62.getSumOfAllNumInString(input);
	}
}
