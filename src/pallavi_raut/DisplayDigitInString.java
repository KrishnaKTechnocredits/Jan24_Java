/* Assignment - 22 : 28th Jan'2024

WAP to find out how many digits are there in given string. 
input : te3c3hn5o2cre3dits
output : 5

Hint : boolean Character.isDigit(char ch)
-----------------------------------------------------------*/
package pallavi_raut;

class DisplayDigitInString {
	int count = 0;

	public static void main(String[] args) {
		DisplayDigitInString strDigit = new DisplayDigitInString();
		strDigit.findDigitString("te3c3hn5o2cre3dits");
	}

	void findDigitString(String str) {
		for (int index = 0; index < str.length(); index++) {
			// char ch= str.charAt(index);
			boolean flag = Character.isDigit(str.charAt(index));
			if (flag == true) {
				count++;
			}
		}
		System.out.println("Total no of digits in " + str + " are " + count);
	}
}
