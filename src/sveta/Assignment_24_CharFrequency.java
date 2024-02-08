/* Assignment - 24 : 29th Jan'2024
Print all the characters from given String having frequency 1 
(print unique characters from given string) [with indexOf & lastIndexOf]
*/
package sveta;

public class Assignment_24_CharFrequency {

	public static void frequencyOfChar(String str) {
		for (int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) 
				System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		frequencyOfChar("technocredits");

	}

}
