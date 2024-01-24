package rohit_sutar;

/*
 * Program is to print all numbers which are divisible by 5 and divisible by 3.
 * Input : Range -> 5 to 40
 * Output : Divisible by 5 & 3, numbers are:
 * 15
 * 30
 */

public class Assignment11 {
	void printNumbersDivisible(int startIndex, int endIndex) {
		System.out.println("Below numbers are divisible by 3 and 5");
		for(int i = startIndex ; i <=endIndex ; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.printNumbersDivisible(5, 40);
	}
}
