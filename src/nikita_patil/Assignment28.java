package nikita_patil;

public class Assignment28 {
	void sumOfallOddDigit(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {

					sum = sum + temp;
				}
			}
		}
		System.out.println("input : " + input);
		System.out.println("output : " + sum);

	}


	public static void main(String[] args) {

		Assignment28 a = new Assignment28();
		a.sumOfallOddDigit("te3ch4noc7red8its");
		a.sumOfallOddDigit("te2chn6ocred8its");
	}
}
