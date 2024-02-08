package technocredits;


// '0' -> 48
// '1' -> 49
// '9' -> 57

public class CharacterEx3 {
	
	int getDigitSum(String str) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		char ch = '1'; // 1
		int sum = 10;
		sum = sum + Character.getNumericValue(ch);
		System.out.println(sum);
		
		int temp = Character.getNumericValue('9'); // 9
		System.out.println(temp);
	}
	
	
}
