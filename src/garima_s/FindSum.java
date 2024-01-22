package garima_s;

public class FindSum {
	void printDivisibleSum(int start_range, int end_range){
		int sum=0;
		for(int num =start_range; num <= end_range; num++){
			if(num%5==0 && num%10==0) {
				sum=sum+num;	
			}
		}
		System.out.println("Sum of Numbers divisible by 5 and 10 :" + sum);
	}
	
	public static void main(String[] args) {
		FindSum findSum = new FindSum();
		findSum.printDivisibleSum(10,50);
	}
}

