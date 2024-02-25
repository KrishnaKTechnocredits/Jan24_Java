package samiksha;

public class NegativeNumSum {

	void printSumOfNegativeNum() {
		int sum = 0;
		String str = " te-3ch4noc7red-8its";
		for (int index = 0; index < str.length(); index++) {
			String temp = "";
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (str.charAt(index - 1) == '-') {
					temp = temp + str.charAt(index - 1) + ch;
					sum = sum + Integer.parseInt(temp);
				}
			}
		}
		System.out.println("sum  of all negative numbers is =" + sum);
	}

	public static void main(String[] args) {
		new NegativeNumSum().printSumOfNegativeNum();
	}
}
