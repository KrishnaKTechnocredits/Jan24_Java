package ankita_s;

public class Assignment82 {
	int getSumOfDigit(String[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			try {
				sum = sum + Integer.parseInt(input[i]);
			} catch (NumberFormatException e) {

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "I am having 11 years and 3 months of experience in java selenium";
		String[] input = str.split(" ");
		Assignment82 ass82 = new Assignment82();
		int sum = ass82.getSumOfDigit(input);
		System.out.println("Sum is:- " + sum);
	}

}
