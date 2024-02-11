package rohini_deshmane.string_programs;

public class CountDigitInString {

	int digitCount(String str) {
		int count=0;
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountDigitInString countInStr = new CountDigitInString();
		String str = "H2i H3el4lo P4un2e5";
		int digitCnt = countInStr.digitCount(str);
		System.out.println("Digit Count from String = "+digitCnt);
	}
}
