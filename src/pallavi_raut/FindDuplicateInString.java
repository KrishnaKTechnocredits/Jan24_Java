/* Assignment - 25 : 29th Jan'2024
Print all the duplicate characters from the given String.

input = "aakanksha";
output : ak 
 ------------------------------------------------------*/
package pallavi_raut;

public class FindDuplicateInString {

	void printDuplicateChar(String str) {
		char ch;
		for(int i=0; i <str.length(); i++) {
			ch = str.charAt(i);
			if(i == str.indexOf(ch)) {
				if(str.indexOf(ch)!=str.lastIndexOf(ch)) {
					System.out.print(ch);
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		FindDuplicateInString findDuplicateInString = new FindDuplicateInString();
		findDuplicateInString.printDuplicateChar("aakanksha");
	}
}
