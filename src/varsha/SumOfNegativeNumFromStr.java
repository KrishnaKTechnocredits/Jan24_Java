package varsha;

//Assignment_61(Print sum of negative numbers:
//input: te-3ch4noc7red-8its
//output: -11"

public class SumOfNegativeNumFromStr {

	int getSumOfNegativeNum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == '-') {
				ch = input.charAt(index + 1);
				sum = sum + (Character.getNumericValue(ch) * (-1));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNegativeNumFromStr sumOfNegativeNumFromStr = new SumOfNegativeNumFromStr();
		int output = sumOfNegativeNumFromStr.getSumOfNegativeNum("te-3ch4noc7red-8its");
		System.out.println(output);
	}
}
