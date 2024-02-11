package sveta;
public class Assignment_51 {

	public String isDigitInString(String str) {
		String input="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!Character.isDigit(ch))
				input+=ch;
		}
		return input;
	}
	
	public void printString(String str) {
		String input = isDigitInString(str);
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new Assignment_51().printString(str);
	}
}
