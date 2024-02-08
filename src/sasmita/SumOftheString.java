package sasmita;

public class SumOftheString {
	public static void main(String[] args) {
		String str = "te3ch4nocred8its";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("sum of all the digits present in the string:" + sum);
	}
}
