package shravani_rapelli;

public class Assignment87 {
	
	String reverseTheString(String str) {
		String temp = "";
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			temp += ch;
		}
		return temp;
	}
	
	void toGetReversedString(String str) {
		String str1[] = str.split(" ");
		String result="";
		for(int i=0; i<str1.length; i++) {
			result += " " + reverseTheString(str1[i]);
		}
		System.out.println(result.trim());
	}
	
	public static void main(String[] args) {
		Assignment87 assgn87 = new Assignment87();
		String str = "Welcome to Technocredits";
		assgn87.toGetReversedString(str);
	}

}
