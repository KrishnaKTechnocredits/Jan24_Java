package ankita_s;

public class SumAndAvgDivisiblebyFiveandSeven {
	int sum = 0;
	int count = 0;
	int avg = 0;
	int num = 0;

	void printSumAndAvgDivisiblebyFiveandSeven(int startindex, int endindex) {
		for (num = startindex; num <= endindex; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println("Numbers are: " + num);
				count++;
				sum = sum + num;
			}
		}
		avg = sum / count;
		System.out.println("Sum= " + sum);
		System.out.println("Average= " + avg);
	}

	public static void main(String[] args) {
		SumAndAvgDivisiblebyFiveandSeven sumAndAvgDivisiblebyFiveandSeven = new SumAndAvgDivisiblebyFiveandSeven();
		System.out.println("Found 3 numbers which are divible by 5 & 7:-");
		sumAndAvgDivisiblebyFiveandSeven.printSumAndAvgDivisiblebyFiveandSeven(1, 110);
	}
}
