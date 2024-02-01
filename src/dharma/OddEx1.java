package dharma;

public class OddEx1 {

	void sumOfOddDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int charV = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
				if (charV % 2 != 0) {
					sum +=charV;
				}
			}

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		OddEx1 oddex1 = new OddEx1();
		oddex1.sumOfOddDigits("te3ch4noc7red8its");
		oddex1.sumOfOddDigits("te2chn6ocred8its");
	}
}
