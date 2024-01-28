//Assignment - 22 : 28th Jan'2024
/*WAP to find out how many digits are there in given string. 
input : te3c3hn5o2cre3dits
output : 5
Hint : boolean Character.isDigit(char ch)*/

package padmaja;

public class DigitsInString {

	void printDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				count++;
		}
		System.out.println("Digits in te3c3hn5o2cre3dits are " + count);
	}

	public static void main(String[] args) {
		DigitsInString digitsInString = new DigitsInString();
		digitsInString.printDigits("te3c3hn5o2cre3dits");
	}
}
