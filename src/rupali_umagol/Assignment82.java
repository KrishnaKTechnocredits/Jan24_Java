package rupali_umagol;

public class Assignment82 {

	int getSumOfDigitFromString(String[] str) {
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			try {
				sum += Integer.parseInt(str[i]);
			} catch (NumberFormatException ne) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "I am having 11 years and 3 months of experience in java selenium";
		String[] str = input.split(" ");
		int sum = new Assignment82().getSumOfDigitFromString(str);
		System.out.println("Sum of Digit in Given string : " + sum);
	}
}
