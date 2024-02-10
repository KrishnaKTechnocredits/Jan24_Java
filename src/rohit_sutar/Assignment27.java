package rohit_sutar;

/*
 * Remove all Uppercase character from given String. 
 * input = "TechNoCREdits"
 * output : echodits
 * boolean Character.isUpperCase(char ch)
 * Turn on screen reader support
 */

public class Assignment27 {
	
	void removeUppercaseChar(String strInput) {
		for (int i = 0 ; i < strInput.length(); i++) {
			char ch = strInput.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				strInput = strInput.replace(ch, '_');
				System.out.println(strInput);
			}
		}
		String str = String.valueOf('_');
		System.out.println();
		//below written line is to replace _ with blank
		System.out.println(strInput.replace(str, ""));
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.removeUppercaseChar("TechNoCREdits");
	}
}
