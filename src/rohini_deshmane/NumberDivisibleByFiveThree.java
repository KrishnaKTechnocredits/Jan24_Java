package rohini_deshmane;

public class NumberDivisibleByFiveThree {
	
	void printNumberDivisible(int startRange, int endRange) {
		for(int i=startRange; i <= endRange; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		NumberDivisibleByFiveThree numberDivisibleByFiveThree = new NumberDivisibleByFiveThree();
		numberDivisibleByFiveThree.printNumberDivisible(5, 40);
	}

}
