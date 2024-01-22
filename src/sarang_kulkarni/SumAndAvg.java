/*Assignment - 15 : 21st Jan'2024

On user defined range print sum and average of numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 110

Output : Numbers are,

35

70

105

Found 3 numbers which are divible by 5 & 7.

sum = 210

Average = 70*/


package sarang_kulkarni;

public class SumAndAvg {
	static int sum=0, avg=0,count=0;
	public static void main(String[] args) {
		SumAndAvg divnum1 = new SumAndAvg();
		System.out.println("Numbers are,");
		divnum1.DivisibleNumber(1, 110); 
		System.out.println("Found 3 numbers which are divisible by 5 & 3");
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+sum/count);
	}
	
	void DivisibleNumber(int StartRange,int EndRange) {
		for(int num = StartRange; num <= EndRange; num++){
			if(num % 5 == 0 && num % 7 == 0) {
				
				System.out.println(+num);
			    count++;
				sum=sum + num;
			}
		}
		
	}

}
