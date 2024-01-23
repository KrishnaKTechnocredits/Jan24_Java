/*Assignment - 16 : 21st Jan'2024
On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70
-------------------------------------*/
package pallavi_raut;

class DivisibleBy5And7 {
	void  sumDivisibleBy5And7(int startIndex, int endIndex) {
		int count = 0;
		int sum = 0;
		System.out.println("Numbers are: ");
		for(int num = startIndex; num<= endIndex; num++) {
			if(num % 5 == 0 && num % 7 == 0) {
				sum = sum + num;
				count++;
				System.out.println(num);
			}
		}
		System.out.println("Found " + count +" numbers which are divisible by 5 and 7.");
		System.out.println("Sum = " +sum);
		System.out.println("Average = " + sum/count);
	}
	
	public static void main(String[] args) {
		DivisibleBy5And7 num5And7 = new DivisibleBy5And7();
		num5And7.sumDivisibleBy5And7(1, 110);
	}
}
