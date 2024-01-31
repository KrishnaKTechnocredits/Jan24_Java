package rohini_deshmane;

/*
 * Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis
 */
public class PrintCharFrequencyWithoutMethod {

	void printCharFrequency(String str) {
		int count=0;
		char ch;
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			count=0;
			for(int i =0; i< str.length(); i++) {
				if(ch == str.charAt(i)) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		PrintCharFrequencyWithoutMethod charPrint = new PrintCharFrequencyWithoutMethod();
		charPrint.printCharFrequency("technocredits");
	}
}
