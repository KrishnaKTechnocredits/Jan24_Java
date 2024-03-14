package garima_s;


public class SumDigitsStringException {

	void sumDigitsString(String[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (isDigitString(arr[index])) {
				sum += Integer.parseInt(arr[index]);
			} 
		}
		System.out.println("Sum of digits in a given String: "+sum);
	}

	boolean isDigitString(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		String[] input = str.split(" ");
		try {
			new SumDigitsStringException().sumDigitsString(input);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}