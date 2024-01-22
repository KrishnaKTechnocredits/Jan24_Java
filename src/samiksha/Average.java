package samiksha;

public class Average {
	
	int sum;
	int count;
	
	void printSumAndAvg(int startR, int endR) {
		for(int num = startR; num <= endR; num++) {
	       if(num % 5 == 0 && num % 7 == 0){
	    	   sum = sum + num;
	    	   count++;
	       }
	    }
		int avg = sum/count;
		System.out.println("sum is " + sum);
		System.out.println("avg is " + avg);
	}
	
	public static void main(String[] args) {
		Average average = new Average();
		average.printSumAndAvg(1, 110);
	}
}
