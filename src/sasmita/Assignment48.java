package sasmita;

public class Assignment48 {
	String getRemoveDigitAndSpecialCharacter(String str) {
		String digit = "";
		String specialchar="";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digit = digit + ch;
			else if (Character.isUpperCase(ch)==false && Character.isLowerCase(ch)== false)
             specialchar= specialchar+ch;
			
		}
		String ans = digit + specialchar;
		System.out.println(ans);
		return ans;


	}

	public static void main(String[] args) {
		new Assignment48().getRemoveDigitAndSpecialCharacter("AasH3v7i");

	}
}
