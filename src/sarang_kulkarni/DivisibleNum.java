/*Assignment - 10 : 21st Jan'2024

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40

Output : Divisible by 5 & 3, numbers are: 15 30*/

package sarang_kulkarni;

public class DivisibleNum {
	public static void main(String[] args) {
		DivisibleNum divnum = new DivisibleNum();
		divnum.DivisibleNumber(5, 40);
	}
	
	void DivisibleNumber(int StartRange,int EndRange) {
		for(int num = StartRange; num <= EndRange; num++) {
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println(+ num);
			}
		}
	}
}
