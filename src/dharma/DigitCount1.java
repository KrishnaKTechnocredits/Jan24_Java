package dharma;

public class DigitCount1 {

	static boolean countDigits(String str) {
		int count = 0;
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)==true) {
				count++;
			}
		}
		System.out.println(count);
		return false;
	}

	public static void main(String[] args){
		countDigits("te3c3hn5o2cre3dits");
	}
}
