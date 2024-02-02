/* Assignment - 24 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [with indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis
---------------------------------------------------------------------------------- */
package pallavi_raut;
public class FindCharFreqWithMethod {
	
	void printCharFreq(String str) {
		char ch; 
		for(int i=0; i <str.length(); i++) {
			ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		FindCharFreqWithMethod findCharFreqWithMethod = new FindCharFreqWithMethod();
		findCharFreqWithMethod.printCharFreq("technocredits");
	}

}
