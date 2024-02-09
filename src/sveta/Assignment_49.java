package sveta;

public class Assignment_49 {

	public char getStringChar(String str) {
		char c=' ';
		char ch=str.charAt(str.length()-1);
		if(Character.isDigit(ch)) 
			c = str.charAt(str.length()-2);
		else
			c = ch;
		return c;
	}
	
	public void printString(String []arr) {
		String str="";
		for(int i=0;i<arr.length;i++) {
			char ch = getStringChar(arr[i]);
			str+=ch;
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String str = "techno credits32 pune4 indi5a";
		String []input =str.split(" ");
		new Assignment_49().printString(input);
	}
}
