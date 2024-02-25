package shravani_rapelli;

public class Assignment65 {
	
	void removeDigitsAndWhiteSpaces(String str) {
		String result= "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch) && ch!=' ') {
				result = result+ch;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Assignment65 assign65 = new Assignment65();
		assign65.removeDigitsAndWhiteSpaces("H2i H3el4lo P4un2e5");
	}

}
