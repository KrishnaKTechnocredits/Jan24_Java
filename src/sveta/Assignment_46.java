package sveta;
public class Assignment_46 {

	public String isUpperCaseSet(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) 
				str1+=ch;
		}
		return str1;
	}
	
	public String isLowerCaseSet(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) 
				str1+=ch;
		}
		return str1;
	}
	
	public String isDigitSet(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) 
				str1+=ch;
		}
		return str1;
	}
	
	public void printString(String str) {
		String strUpperCase=isUpperCaseSet(str);
		String strLowerCase=isLowerCaseSet(str);
		String strDigit=isDigitSet(str);
		str=strDigit+strUpperCase+strLowerCase;
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String str = "AasH3v7i";
		new Assignment_46().printString(str);
	}
}
