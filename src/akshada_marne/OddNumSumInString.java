package akshada_marne;

public class OddNumSumInString {

	void calculate(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			int num = Character.getNumericValue(ch);
			if (flag == true) {
				if (Character.getNumericValue(ch) % 2 != 0) {
					sum = sum + num;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String args[]) {
		OddNumSumInString oddNumSumInString = new OddNumSumInString();
		oddNumSumInString.calculate("te3ch4noc7red8its");
		oddNumSumInString.calculate("te2chn6ocred8its");

	}
}
