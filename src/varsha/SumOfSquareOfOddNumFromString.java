package varsha;

//"Print sum of squares of odd digits:
//input: te3ch4noc7red8its
//output: 58 
//Hint: 3^2 + 7^2 = 9 + 49 = 58"

class SumOfSquareOfOddNumFromString {

	int getSumOfOddSquareInGivenStr(String input) {
		int sum = 0;
		int square = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 != 0) {
					square = num * num;
					sum = sum + square;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfSquareOfOddNumFromString sumOfSquareOfOddNumFromString = new SumOfSquareOfOddNumFromString();
		int num = sumOfSquareOfOddNumFromString.getSumOfOddSquareInGivenStr("te3ch4noc7red8its");
		System.out.println(num);
	}
}