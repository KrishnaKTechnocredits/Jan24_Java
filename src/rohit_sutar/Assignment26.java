package rohit_sutar;

import ankita_s.Assigment25;

/*
 * Remove all the vowels from given String.
 * input : technocredits
 * output : tchncrdts
 */
public class Assignment26 {

	void removeVowel(String strInput) {
		for(int i = 0 ; i < strInput.length() ; i++) {
			char ch = strInput.charAt(i);
			//System.out.println(ch);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				strInput = strInput.replace(ch, '_');
				//System.out.println(strInput);
			}
		}
		String str = String.valueOf('_');
		//System.out.println(str);
		System.out.println("Here is string without Vowels : "+strInput.replace(str, ""));
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.removeVowel("technocredits");
	}
}
