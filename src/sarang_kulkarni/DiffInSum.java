/*Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7
*/

package sarang_kulkarni;

public class DiffInSum {
	
	static int sum1=0,sum2=0;
	void DiffSum(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int num= Character.getNumericValue(ch);
				if(num %2 != 0) {
					sum1=sum1 + num;
				}
				else {
					sum2=sum2 + num;
					
				}
			}
		}
		System.out.println("Diff of Even and Odd digit sum =  " + (sum1-sum2));
	}
	
	public static void main(String[] args) {
		
		new DiffInSum().DiffSum("te3ch4noc7re9d8its");
	}

}
