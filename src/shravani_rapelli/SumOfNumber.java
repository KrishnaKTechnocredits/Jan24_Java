package shravani_rapelli;

public class SumOfNumber {
	
	void printSumNumber(int startIndex, int endIndex){
		int sum=0;
		for(int num = startIndex; num <= endIndex; num++) {
			if(num % 5 == 0 && num % 10 == 0)
				sum = sum + num;
		}
		System.out.println("Expected Output is " + sum);
	}
	
	public static void main(String[] args) {
		SumOfNumber sumNumber = new SumOfNumber();
		sumNumber.printSumNumber(10, 50);
	}

}
