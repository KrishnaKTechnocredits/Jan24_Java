package samiksha;

public class DivisionLastNo {
	
	int count;
	
	void printLastDivNo(int startRange, int endRange) {
		for(int num = startRange; num <= endRange; num++) {
			if(num% 5 == 0 && num % 9 == 0) {
				count=num;
			}
		 }
	    System.out.println("Last no divisible by "+ startRange +" and " + endRange + " is " + count);
	}
	
	public static void main(String[] args) {
		DivisionLastNo div = new DivisionLastNo();
		div.printLastDivNo(5, 100);
	}
}
