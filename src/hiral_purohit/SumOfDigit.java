package hiral_purohit;

public class SumOfDigit {

	int sum = 0;

	void getNumValue(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int i = Character.getNumericValue(ch);
				sum = sum + i;
			}
		}
		System.out.println("sum of digits from String--> "+sum);
	}

	public static void main(String[] args) {
		new SumOfDigit().getNumValue("te3ch4nocred8its");
		new SumOfDigit().getNumValue("technocredits");
	}

}
