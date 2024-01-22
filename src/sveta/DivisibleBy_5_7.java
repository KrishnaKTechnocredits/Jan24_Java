/* Assignment - 15 : 21st Jan'2024
On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
35 70 105

Found 3 numbers which are divible by 5 & 7.

sum = 210

Average = 70 */
package sveta;

public class DivisibleBy_5_7 {

	public void division(int start, int end) {
		int sum=0;
		int count=0;
		for(int i=start;i<=end;i++) {
			if(i%5 == 0 && i%7 ==0) {
				System.out.println(i);
				sum+=i;
				count++;
			}
			if(count==3)
				break;
		}
		
		System.out.println("sum is " +sum);
		System.out.println("Average is "+ (sum/count));
	}
	public static void main(String[] args) {
		DivisibleBy_5_7 div = new DivisibleBy_5_7();
		div.division(1, 110);

	}

}
