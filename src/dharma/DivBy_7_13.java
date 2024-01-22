/*Assignment - 11 : 21st Jan'2024
On user defined range print all numbers which are divisible by 7 or 13 in reverse order.

Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
 */
package dharma;

public class DivBy_7_13 {

	public void division(int start, int end) {
		for(int i=start;i<=end;i++) {
			if(i%7 == 0) {
				System.out.println(i + " is divisible by 7");
			}else if(i%13 == 0) {
				System.out.println(i +" is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args) {
		DivBy_7_13 div = new DivBy_7_13();
		div.division(5, 40);
	}
}
