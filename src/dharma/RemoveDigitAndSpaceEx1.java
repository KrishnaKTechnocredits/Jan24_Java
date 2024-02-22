package dharma;

public class RemoveDigitAndSpaceEx1 {

	void removeDigitsAndSpace(String str) {
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch) || Character.isWhitespace(ch)) {
				String temp = String.valueOf(ch);
				str = str.replace(temp, "#");
			}
		}
		str = str.replace("#", "");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		new RemoveDigitAndSpaceEx1().removeDigitsAndSpace("H2i H3el4lo P4un2e5");
	}
}
