package varsha.Exception;

//Assignment - 82 : 14th March'2024
//String str = "I am having 11 years and 3 months of experience in java selenium";
//output : 14
//
//NOTE : use Exception concept 

public class ExceptionEx1 {

	static int getTheSumOfDigitInGivenStr(String[] input) {
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
		int sum = ExceptionEx1.getTheSumOfDigitInGivenStr(input);
		System.out.println(sum);
	}
}
