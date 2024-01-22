package garima_s;

public class FindSumAverage {
	void printDivisibleSum(int start_range, int end_range){
		int sum=0;
		int avg=0;
		int count=0;
		System.out.println("Numbers are Divisible by 5 and 7 are : ");
		for(int num =start_range; num <= end_range; num++){
			if(num%5==0 && num%7==0) {
				sum=sum+num;
				System.out.println(num);
				count++;
			}
		}
		System.out.println("Found "+count+ " which is divisible by 5 and 7");
		avg=sum/count;
		System.out.println("Sum :" + sum);
		System.out.println("Average :" + avg);
	}
	
	public static void main(String[] args) {
		FindSumAverage findSumAverage = new FindSumAverage();
		findSumAverage.printDivisibleSum(10,110);
	}
}
