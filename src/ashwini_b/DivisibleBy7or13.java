package ashwini_b;

/*
 On user defined range print all numbers which are divisible by 7 or 13 in reverse order.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
39 is divisible by 13
35 is divisible by 7
28 is divisible by 7
26 is divisible by 13
21 is divisible by 7
14 is divisible by 7
13 is divisible by 13
7 is divisible by 7
 */

public class DivisibleBy7or13 {
	
	void printDivisibleBy53(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 7== 0){
				System.out.println(index + " is divisible by 7");
			}
			else if(index % 13 == 0){
				System.out.println(index + " is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args) {
		DivisibleBy7or13 divisibleBy7or13 = new DivisibleBy7or13();
		divisibleBy7or13.printDivisibleBy53(5, 40);
		
		

	}

}
