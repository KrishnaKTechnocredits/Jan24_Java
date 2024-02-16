package shravani_rapelli;

public class Assignment64 {
	
	void printStringByPlacingSpecialcharactersAtEnd(String str) {
		String str1="";
		String str2="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)||Character.isLowerCase(ch)||Character.isDigit(ch)) {
				str1 = str1 + ch;
			}else
			{
				str2 = str2 +ch;
			}
		}
		System.out.print(str1+str2);
	}
	public static void main(String[] args) {
		Assignment64 assign64 = new Assignment64();
		assign64.printStringByPlacingSpecialcharactersAtEnd("-AasH?3v7i!");
	}

}
