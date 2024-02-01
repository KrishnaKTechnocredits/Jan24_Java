package rohini_deshmane;

public class RemoveAllUpperCaseChars {
	
	void removeUpperLetter(String str) {
		char ch;
		boolean isUpper;
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
			isUpper = Character.isUpperCase(ch);
			if(isUpper == true) {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*","");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveAllUpperCaseChars removeAllUpperCaseChars = new RemoveAllUpperCaseChars();
		removeAllUpperCaseChars.removeUpperLetter("TechNoCREdits");
	}
}
