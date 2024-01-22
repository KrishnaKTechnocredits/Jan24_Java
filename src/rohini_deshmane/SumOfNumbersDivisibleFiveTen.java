package rohini_deshmane;

public class SumOfNumbersDivisibleFiveTen {
	
	void printSumDivisibleBy(int startRange, int endRange) {
		int sum=0;
		
		for(int i=startRange; i<= endRange; i++) {
			if(i%5==0 && i%10==0) {
				sum=sum+i;
			}
		}
		System.out.println("Expected sum is "+sum);
	}
	
	public static void main(String[] args) {
		SumOfNumbersDivisibleFiveTen sumOfNumbersDivisibleFiveTen = new SumOfNumbersDivisibleFiveTen();
		sumOfNumbersDivisibleFiveTen.printSumDivisibleBy(10, 50);
	}

}
