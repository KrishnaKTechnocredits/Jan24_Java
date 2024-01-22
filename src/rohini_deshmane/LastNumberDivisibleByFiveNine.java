package rohini_deshmane;

public class LastNumberDivisibleByFiveNine {
	
	void numberdivisibleBy(int startRange, int endRange) {
		int lastNumber=0;
		for(int i=5; i<= 100; i++) {
			if(i%5==0 && i%9==0) {
				lastNumber = i;
			}
		}
		System.out.println("Last number divisible by 5 & 9 is "+lastNumber);
	}
	
	public static void main(String[] args) {
		LastNumberDivisibleByFiveNine lastNumberDivisibleByFiveNine = new LastNumberDivisibleByFiveNine();
		lastNumberDivisibleByFiveNine.numberdivisibleBy(5, 100);
	}

}
