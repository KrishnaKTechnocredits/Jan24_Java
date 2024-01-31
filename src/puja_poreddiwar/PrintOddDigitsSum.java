package puja_poreddiwar;

public class PrintOddDigitsSum {

	void printAllOddDigits(String str) {
		System.out.print("sum of all the odd digits in the given String : " );
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					sum = sum + num;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		PrintOddDigitsSum printOddDigits = new PrintOddDigitsSum();
		printOddDigits.printAllOddDigits("te3ch4noc7red8its");
		printOddDigits.printAllOddDigits("te2chn6ocred8its");

	}
}
