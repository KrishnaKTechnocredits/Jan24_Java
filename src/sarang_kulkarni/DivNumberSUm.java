/*Assignment - 13 : 21st Jan'2024
On user defined range print sum of all the number which is divisible by 5 & 10.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 50

Output : Expected sum is 150*/


package sarang_kulkarni;

public class DivNumberSUm {
	int sum=0;
	public static void main(String[] args) {
		DivNumberSUm divnum1 = new DivNumberSUm();
		divnum1.DivisibleNumber(10, 50); 
	}
	
	void DivisibleNumber(int StartRange,int EndRange) {
		for(int num = StartRange; num <= EndRange; num++){
			if(num % 5 == 0 && num % 10 == 0) 
				sum=sum + num;
		}
		System.out.println("Expected sum is "+sum);
	}
		
		
}
