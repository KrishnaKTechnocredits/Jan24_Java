package shravani_rapelli;

public class LastNumberDivisible {
	
	void printNumberDivisble(int startRange, int endRange) {
		int count = 0;
		for(int num = startRange; num < endRange; num++) {
			if(num % 5 == 0 && num % 9 == 0)
				count = num;
		}
		System.out.println("Last number divisible by 5 & 9 is " + count);
	}
	
	public static void main(String[] args) {
		LastNumberDivisible lastNumber = new LastNumberDivisible();
		lastNumber.printNumberDivisble(5, 100);
	}
}
