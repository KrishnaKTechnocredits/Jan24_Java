package shravani_rapelli;

public class Assignment57 {
	
	void sumOfSquaresOfOddDigits(String input) {
		int sum = 0;
		int square=0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
					int num = Character.getNumericValue(ch);
					if(num % 2 != 0) {
					square = num * num;
					sum = sum + square;
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment57 assign57 = new Assignment57();
		assign57.sumOfSquaresOfOddDigits("te3ch4noc7red8its");
	}

}
