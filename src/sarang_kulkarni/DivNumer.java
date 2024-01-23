/*Assignment - 11 : 21st Jan'2024
On user defined range print all numbers which are divisible by 7 or 13 in reverse order.

Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40

Output : Divisible by 7 or 13, numbers are:

39 is divisible by 13

35 is divisible by 7

28 is divisible by 7

26 is divisible by 13

21 is divisible by 7

14 is divisible by 7*/

package sarang_kulkarni;

public class DivNumer {
	public static void main(String[] args) {
		DivNumer divnum1 = new DivNumer();
		divnum1.DivisibleNumber(40, 5);
	}
	
	void DivisibleNumber(int StartRange,int EndRange) {
		for(int num = StartRange; num >= EndRange; num--){
			if(num % 13 == 0) {
				System.out.println(+ num+" number is divisible by "+StartRange);
			}
			else if(num % 7 == 0) {
				System.out.println(+ num+" number is divisible by "+StartRange);
			}
		}
	}


}
