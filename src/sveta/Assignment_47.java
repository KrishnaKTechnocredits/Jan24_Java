package sveta;

public class Assignment_47 {

	public void isDigitAvailable(String str) {
		String digitHolder="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
				digitHolder+=ch;
		}
		System.out.println(digitHolder);
	}
	
	public static void main(String[] args) {
		String str ="Aas-H3v7i";
		new Assignment_47().isDigitAvailable(str);
	}
	
}
