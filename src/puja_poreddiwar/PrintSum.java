package puja_poreddiwar;

public class PrintSum {
	
	int sum=0;

	void printSumOfdigits(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				//System.out.println(ch);
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Sum of all digits present in string is : " + sum);
	}

	public static void main(String[] args) {
		PrintSum printSum = new PrintSum();
		printSum.printSumOfdigits("te3ch4nocred8its");
	}

}
