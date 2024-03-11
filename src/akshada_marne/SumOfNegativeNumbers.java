package akshada_marne;

public class SumOfNegativeNumbers {

	void addition(String str) {

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '-') {
				char ch = str.charAt(i + 1);
				sum = sum + (Character.getNumericValue(ch) * (-1));
			}
		}
		System.out.println(sum);
	}

	public static void main(String args[]) {
		SumOfNegativeNumbers sumOfNegativeNumbers = new SumOfNegativeNumbers();
		String str = "te-3ch4noc7red-8its";
		sumOfNegativeNumbers.addition(str);

	}
}
