/*Assignment - 57 : 14th Feb'2024
"Print sum of squares of odd digits:
input: te3ch4noc7red8its
output: 58 
Hint: 3^2 + 7^2 = 9 + 49 = 58"
*/
package sarang_kulkarni;

public class SumOSquareOFOddDigits {
	static int sum=0;
	public static void main(String[] args) {
		new SumOSquareOFOddDigits().sumOSquareOFOddDigits("te3ch4noc7red8its");
	}
	void sumOSquareOFOddDigits(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int num=Character.getNumericValue(ch);
				if(num % 2 !=0) {
					sum=sum+(num*num);
				}
				}
		 }
		System.out.println("Sum = "+sum);
	}

}
