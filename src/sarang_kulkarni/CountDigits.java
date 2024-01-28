/*Assignment - 22 : 28th Jan'2024

WAP to find out how many digits are there in given string. 
input : te3c3hn5o2cre3dits
output : 5*/

package sarang_kulkarni;

public class CountDigits {
	
	static int count=0;
	void coundigits() {
		String str="te3c3hn5o2cre3dits4";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total nnumber of digits in given string = "+count);
	}
	
	public static void main(String[] args) {
		
		new CountDigits().coundigits();
	}

}
