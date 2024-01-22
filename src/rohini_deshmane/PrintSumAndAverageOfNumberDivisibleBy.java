package rohini_deshmane;

class PrintSumAndAverageOfNumberDivisibleBy {

	void printSumAndAverage(int startRange, int endRange) {
		int count=0, sum=0;
		System.out.println("Numbers are, ");
		for(int i=startRange; i<= endRange; i++) {
			if(i%5==0 && i%7==0) {
				sum = sum+i;
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+sum/count);
	}
	
	public static void main(String[] args) {
		PrintSumAndAverageOfNumberDivisibleBy printSumAndAverageOfNumberDivisibleBy = new PrintSumAndAverageOfNumberDivisibleBy();
		printSumAndAverageOfNumberDivisibleBy.printSumAndAverage(1, 110);
	}
}
