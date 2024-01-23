package shravani_rapelli;

public class AverageAndSum {
	
	void printSumAverage(int startIndex, int endIndex){
		int sum=0;
		int count=0;
		int average=0;
		for(int num = startIndex; num <= endIndex; num++) {
			if(num % 5 == 0 && num % 7 == 0) {
				sum = sum + num;
				count++;
				average = sum / count;
			}
		}
		
		System.out.println("Found 3 numbers which are divisible by 5 & 7 \n" +"sum = "+ sum+"\nAverage = "+ average);
	}
	
	public static void main(String[] args) {
		AverageAndSum averagesum = new AverageAndSum();
		averagesum.printSumAverage(1, 110);
	}
}
