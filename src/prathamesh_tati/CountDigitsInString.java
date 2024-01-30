/*Assignment - 22 : 28th Jan'2024

WAP to find out how many digits are there in given string. 

Hint : boolean Character.isDigit(char ch)*/

package prathamesh_tati;

public class CountDigitsInString {
	int count = 0;

	void getNumberOfDigitsInString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				count++;
			}
		}
		System.out.println("No of digits in " + str + " are : " + count);
	}

	public static void main(String[] args) {
		CountDigitsInString countDigitsInString = new CountDigitsInString();
		countDigitsInString.getNumberOfDigitsInString("te3c3hn5o2cre3dits");
	}
}