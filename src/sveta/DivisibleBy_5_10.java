/*Assignment - 13 : 21st Jan'2024
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150 */
package sveta;

public class DivisibleBy_5_10 {

	public void sumOfRange(int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(i%5 == 0 && i%10 ==0) {
				sum+=i;
			}
		}
		System.out.println("the sum of numbers which divisivle by 5 & 10 is " + sum);
	}
	public static void main(String[] args) {
		DivisibleBy_5_10 div= new DivisibleBy_5_10();
		div.sumOfRange(10, 50);
	}

}
