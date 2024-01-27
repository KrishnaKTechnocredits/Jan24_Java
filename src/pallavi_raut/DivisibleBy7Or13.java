/*Assignment - 12 : 21st Jan'2024
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
-----------------------------------------*/
package pallavi_raut;
class DivisibleBy7Or13{

	void printDivisibleBy7Or13(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (int count = endIndex; count >= startIndex; count --){
			if (count % 7 == 0){
				System.out.println(count + " is divisible 7");
			}
			else if (count % 13 == 0){
				System.out.println(count + " is divisible 13");
			}
		}
	}
		
	public static void main(String[] args){
		DivisibleBy7Or13 num7Or13 = new DivisibleBy7Or13();
		num7Or13.printDivisibleBy7Or13(5,40);
	}
}