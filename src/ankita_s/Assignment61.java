package ankita_s;

public class Assignment61 {

	void printSumOfNegNum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '-') {
				char ch = str.charAt(i + 1);
				sum = sum + (Character.getNumericValue(ch) * (-1));
			}
		}
		System.out.println("Sum of negative numbers: " + sum);
	}

	public static void main(String[] args) {
		String str = "te-3ch4noc7red-8its";
		Assignment61 ass61 = new Assignment61();
		ass61.printSumOfNegNum(str);
	}
}
