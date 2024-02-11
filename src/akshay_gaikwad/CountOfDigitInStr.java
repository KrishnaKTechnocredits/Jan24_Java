package akshay_gaikwad;

public class CountOfDigitInStr {
	int getCountOfDigitInStr(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index))){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int count = new CountOfDigitInStr().getCountOfDigitInStr("H2i H3el4lo P4un2e5");
		System.out.println("Numbers of digits in given string is " + count);
	}
}
