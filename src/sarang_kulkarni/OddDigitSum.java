/*Assignment - 28 : 31st Jan'2024

Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0 */

package sarang_kulkarni;

public class OddDigitSum {
	
	static int sum=0;
	void DigitSum(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int num= Character.getNumericValue(ch);
				if(num %2 != 0)
					sum=sum + num;
			}
		}
		System.out.println("Total sum of odd digits in given string  "+str+ " = "  +sum);
	}
	
	public static void main(String[] args) {
		
		new OddDigitSum().DigitSum("te3ch4noc7red8its");
		sum=0;
		new OddDigitSum().DigitSum("te2chn6ocred8its");
	}

}
