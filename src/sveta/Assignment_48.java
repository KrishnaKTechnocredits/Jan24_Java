package sveta;

public class Assignment_48 {

	public void printString(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) 
				str1 += ch;
		}
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		String str = "Aas-H3v7i";
		new Assignment_48().printString(str);
	}
}
