package rohini_deshmane;

public class EvenNumberBetweenRange {

	void printEvenNumbers(int startRange, int endRange) {
		for(int i= startRange; i <= endRange; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumberBetweenRange evenNumberBetweenRange = new EvenNumberBetweenRange();
		evenNumberBetweenRange.printEvenNumbers(10,	15);
	}
}
