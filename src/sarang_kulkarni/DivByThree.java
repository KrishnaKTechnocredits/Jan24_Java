/*Assignment - 14 : 21st Jan'2024
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500

Output : First 3 numbers divisible by 3 and 4 is :

12

24

36*/

package sarang_kulkarni;

public class DivByThree {
	public static void main(String[] args) {
		DivByThree divnum1 = new DivByThree();
		divnum1.DivisibleNumber(10, 500); 
	}
	
	void DivisibleNumber(int StartRange,int EndRange) {
		int count= 0;
		for(int num = StartRange; num <= EndRange; num++){
			if(num % 3 == 0 && num % 4 == 0) {
				count++;
				if(count<=3) {
				System.out.println(+num);
				}
			}
		}
	}
}
