package akshay_gaikwad;

public class SumAndAvgOfNumDivBy5And7 {
	void sumAndAvgOfNumDivBy5And7(int startNum , int endNum) {
		int sum= 0;
		int count = 0;
		System.out.println("Numbers are : ");
		for (int index = startNum ;index <= endNum ; index++) {
			if (index%5 == 0 && index%7 == 0) {
				System.out.println(index);
				sum = sum + index;
				count++;
			}
		}
		System.out.println("Found " + count + " numbers which are divisible 3 and 7.");
		System.out.println("Sum = " + sum );
		System.out.println("Average = " + sum/count);
	}
	
	public static void main(String[] args) {
		SumAndAvgOfNumDivBy5And7 sumandavgofnumdivby5and7 = new SumAndAvgOfNumDivBy5And7();
		sumandavgofnumdivby5and7.sumAndAvgOfNumDivBy5And7(1, 110);
	}
}