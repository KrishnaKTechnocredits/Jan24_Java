package shramika_vaidya;

public class SumOfDigitsInStringUsingException {

	void GetSumOfDigit(String[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				sum = sum + Integer.parseInt(arr[i]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String str = "I am Having 11 Years And 3 months Of Experience In Java Selinium ";
		String[] str1 = str.split(" ");
		new SumOfDigitsInStringUsingException().GetSumOfDigit(str1);
	}
}
