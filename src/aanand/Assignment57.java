package aanand;

/*Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58*/

public class Assignment57 {
	void sumSquareOfOddDigit(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 1) {
					int suqare = num * num;
					sum = sum + suqare;
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment57 assignment57 = new Assignment57();
		assignment57.sumSquareOfOddDigit("te3ch4noc7red8its");
	}
}