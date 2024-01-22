package rohit_sutar;

/*
 * Program is to print all even numbers between 10 -15
 * Output will be 10, 12, 14
 */

public class Assignment10 {

	void printAllEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Below listed numbers are Even numbers between "+startIndex+ " and "+endIndex);
		for(int i = startIndex ; i<= endIndex ; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[]) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.printAllEvenNumbers(10, 15);
	}
}
