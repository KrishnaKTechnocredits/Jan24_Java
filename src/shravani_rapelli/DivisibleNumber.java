package shravani_rapelli;

public class DivisibleNumber {
	
	void printDivisibleNumbers(int startIndex, int endIndex) {
		for(int num = startIndex; num <= endIndex; num++) {
			if(num % 5 == 0 && num % 3 == 0)
				System.out.println("Divisible by 5 & 3 numbers are " + num);
		}
	}
	
	public static void main(String[] args) {
		DivisibleNumber divisibleNumber = new DivisibleNumber();
		divisibleNumber.printDivisibleNumbers(5, 40);
	}


}
