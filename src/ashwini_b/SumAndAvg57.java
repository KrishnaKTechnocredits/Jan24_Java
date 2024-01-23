package ashwini_b;

/*
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
 */
public class SumAndAvg57 {

	void printSumAndAvg(int startIndex, int endIndex) {
		int sum = 0;
		int avg = 0;
		int count = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 7 == 0) {
				System.out.println(index);
				sum = index + sum;
				count++;
				avg = sum / count;
			}
		}
		System.out.println("Found " + count + " numbers which are divible by 5 & 7");
		System.out.println("sum = " + sum);
		System.out.println("Average  = " + avg);
	}

	public static void main(String[] args) {
		SumAndAvg57 sumAndAvg57 = new SumAndAvg57();
		sumAndAvg57.printSumAndAvg(1, 110);
	}
}
