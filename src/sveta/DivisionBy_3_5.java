/*Assignment - 10 : 21st Jan'2024
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
*/
package sveta;

public class DivisionBy_3_5 {

	public void division(int start, int end) {
		for(int i = start;i<=end;i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		DivisionBy_3_5 div = new DivisionBy_3_5();
		System.out.println("Divisible by 3 & 5 numbers are :");
		div.division(5, 40);
	}

}
