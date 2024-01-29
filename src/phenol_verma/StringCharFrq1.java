/*@all, important assignments
Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis*/

package phenol_verma;

public class StringCharFrq1 {

	void charCount(String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			
		}
				
	}
	
	public static void main(String[] args) {
		StringCharFrq1 stringCharFrq1 = new StringCharFrq1();
		stringCharFrq1.charCount("technocredits");
	}
}
