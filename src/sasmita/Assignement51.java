package sasmita;

public class Assignement51 {
	String getremoveDigitFromString(String str) {
		String str1=" ";
		for(int index=0; index<str.length();index++) {
			char ch= str.charAt(index);
			if(!Character.isDigit(ch)) {
				str1= str1+ch;
			}
		}
		System.out.println(str1);
		return str1;
	}
	public static void main(String[] args) {
		String str ="H2i H3el4lo P4un2e5";
		new Assignement51().getremoveDigitFromString(str);
	}
}
