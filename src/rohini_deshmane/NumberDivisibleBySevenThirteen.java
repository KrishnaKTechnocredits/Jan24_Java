package rohini_deshmane;

public class NumberDivisibleBySevenThirteen {
	
	void printNumberDivisible(int startRange, int endRange) {
		for(int i=startRange; i<= endRange; i++) {
			if(i%7==0) {
				System.out.println(i +" is Divisible by "+7);
			} else if(i%13==0) {
				System.out.println(i +" is Divisible by "+13);
			}
		}
	}
	
	public static void main(String[] args) {
		NumberDivisibleBySevenThirteen numberDivisibleBySevenThirteen = new NumberDivisibleBySevenThirteen();
		numberDivisibleBySevenThirteen.printNumberDivisible(5, 40);
	}

}
