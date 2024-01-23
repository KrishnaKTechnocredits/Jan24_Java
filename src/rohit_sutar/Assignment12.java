package rohit_sutar;

public class Assignment12 {

	void printDivisibleNoReverseOrder(int startIndex, int endIndex) {
		System.out.println("Below listed numbers are divisible by 7 and 13");
		for(int i = startIndex ; i>=endIndex ; i--) {
			if(i % 13 == 0 || i % 7 == 0) {
				if(i % 13 == 0) {
					System.out.println(i+" is divisible by 13");
				}else {
					System.out.println(i+" is divisible by 7");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.printDivisibleNoReverseOrder(40, 5);
	}
}
