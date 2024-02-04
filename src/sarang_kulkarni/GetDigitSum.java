
/*Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.

input : te3ch4nocred8its
output : 15

input : technocredits
output : 0*/

package sarang_kulkarni;

public class GetDigitSum {
	
	static int sum=0;
	void DigitSum(String str) {
		//String str="te3ch4nocred8its";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				sum=sum+ Character.getNumericValue(ch);
			}
		}
		System.out.println("Total sum of digits in given string  "+str+ " = "  +sum);
	}
	
	public static void main(String[] args) {
		
		new GetDigitSum().DigitSum("te3ch4nocred8its");
		sum=0;
		new GetDigitSum().DigitSum("technocredits");
	}

	

}
