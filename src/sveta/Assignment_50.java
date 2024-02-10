package sveta;
public class Assignment_50 {

	public int isDigitInString(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
				count++;
		}
		return count;
	}
	
	public void printString(String str) {
		int count = isDigitInString(str);
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new Assignment_50().printString(str);
	}
	
}
