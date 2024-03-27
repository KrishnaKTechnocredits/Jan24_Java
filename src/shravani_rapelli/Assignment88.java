package shravani_rapelli;

public class Assignment88 {
	
	String toGetReverseString(String str) {
		String temp = "";
		for(int i=str.length()-1; i>=0 ; i--) {
			char ch = str.charAt(i);
			temp += ch;
		}
		return temp;
	}
	
	void reversedString(String str) {
		String str1[] = str.split(" ");
		String result = "";
		for(int i=0; i<str1.length-1; i++) {
			str1[0] = toGetReverseString(str1[i]);
			result += " " + str1[i];
		}
		str1[str1.length-1] = toGetReverseString(str1[str1.length-1]);
		result += " " + str1[str1.length-1];
		System.out.println(result.trim());
	}
	
	public static void main(String[] args) {
		Assignment88 assgn88 = new Assignment88();
		String str = "Welecome to the techno Technocredits";
		assgn88.reversedString(str);
	}
}
