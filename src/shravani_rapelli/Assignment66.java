package shravani_rapelli;

public class Assignment66 {
	
	void replaceDigitWithChar(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				str =str.replace(str.charAt(i), '*');
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Assignment66 assign66 = new Assignment66();
		assign66.replaceDigitWithChar("H2iH3el4loP4un2e5");
	}

}
