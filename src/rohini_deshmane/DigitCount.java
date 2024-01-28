package rohini_deshmane;

public class DigitCount {
	static int count;
	
	static int getcountOfDigit(String str) {
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch) ==true) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int count =DigitCount.getcountOfDigit("te3c3hn5o2cre3dits");
		System.out.println("Digit count = "+count);
	}
}
