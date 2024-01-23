/*Assignment - 10 : 21st Jan'2024
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30*/

package prathamesh_tati;

public class DivisibleNumbers {
	
	void numbers(int startRange, int endRange) {
		
		System.out.println("Divisible by 5 & 3, numbers are:");
		
		for(int num1 = startRange; num1 <= endRange; num1++) {
			if(num1 % 5 ==0 && num1 % 3 ==0){
				System.out.println(num1);				
			}
		}
	}

	public static void main(String[] args) {
		DivisibleNumbers divisibleNumbers = new DivisibleNumbers();
		divisibleNumbers.numbers(5, 40);
	}
}