package shravani_rapelli;

public class Assignment48 {
	
	String getStringWithoutDigitSpecialChar(String str) {
		
		String Digit = "";
		String SpecialChar = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch))
				Digit = Digit + ch;
			else if(!Character.isUpperCase(ch)== false && !Character.isLowerCase(ch)== false)
				SpecialChar = SpecialChar + ch;
		}
		String output = Digit + SpecialChar;
		System.out.println(output);
		return output;
	}
	
	public static void main(String[] args) {
		Assignment48 assign48 = new Assignment48();
		assign48.getStringWithoutDigitSpecialChar("AasH3v7i");
	}

}
