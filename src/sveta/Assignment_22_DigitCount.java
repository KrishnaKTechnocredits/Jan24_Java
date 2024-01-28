/*Assignment - 22 : 28th Jan'2024

WAP to find out how many digits are there in given string. 
input : te3c3hn5o2cre3dits
output : 5

Hint : boolean Character.isDigit(char ch) */
package sveta;

public class Assignment_22_DigitCount {

	static boolean countDigit(String str) {
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)==true) {
				count++;
			}
		}
		System.out.println(count);
		return false;
		
	}
	public static void main(String[] args) {
		countDigit("te3c3hn5o2cre3dits");

	}

}
