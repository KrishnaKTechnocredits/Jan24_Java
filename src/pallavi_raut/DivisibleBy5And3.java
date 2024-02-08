/* Assignment - 11 : 21st Jan'2024
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
--------------------------------------------------------------------*/
package pallavi_raut;
class DivisibleBy5And3{
	
	void printDivisibleBy5And3(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int count = startIndex; count <= endIndex; count ++){
			if (count % 5 == 0 && count %3 == 0){
				System.out.println(count);
			}
		}
	}
		
	public static void main(String[] args){
		DivisibleBy5And3 num5And3 = new DivisibleBy5And3();
		num5And3.printDivisibleBy5And3(5,40);
	}
}	
	
