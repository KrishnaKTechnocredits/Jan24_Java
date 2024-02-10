package rohit_sutar;

/*
 * Assignment - 23 : 29th Jan'2024
 * Print all the characters from given String having frequency 1 
 * (print unique characters from given string) [without indexOf & lastIndexOf]
 * String str = "technocredits"
 * output : hnordis
 */

public class Assignment23 {

	int charFrequency(String strInput, char ch) {
		int count = 0;
		for (int i = 0; i < strInput.length(); i++) {
			char ch1 = strInput.charAt(i);			
			if (ch == ch1) {
				count++;
			}
		}
		return (count);
	}
	
	void uniqueChar(String str) {
		for (int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			int charcount = charFrequency(str, ch);
			if (charcount == 1) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.uniqueChar("technocredits");
	}
}

