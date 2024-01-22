/*Assignment - 12 : 21st Jan'2024
On user defined range print last number which is divisible by 5 & 9.

Hint : pass start and end index as a parameter.

Input : Range -> 5 to 100

Output : Last number divisible by 5 & 9 is 90*/

package sarang_kulkarni;

public class LastDivNumber {
	int num1=0;
	public static void main(String[] args) {
		LastDivNumber divnum1 = new LastDivNumber();
		divnum1.DivisibleNumber(5, 100);
	}
	
	void DivisibleNumber(int StartRange,int EndRange) {
		for(int num = StartRange; num <= EndRange; num++){
			if(num % 5 == 0 && num % 9 == 0) {
				num1=num;
			}
			
		}
		System.out.println("Last number divisible by 5 and 9 is "+num1);
	}
}
