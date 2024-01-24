/*Assignment - 13 : 21st Jan'2024
On user defined range print last number which is divisible by 5 & 9.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90
--------------------------------------------------------*/
package pallavi_raut;

class DivisibleBy5And9{
	
	void printDivisibleBy5And9(int startIndex, int endIndex){
		int temp=0;
		for (int count = endIndex; count >= startIndex; count --){
			if (count % 5 == 0 && count % 9 == 0){
				temp++;
				if( temp == 1){
					System.out.println("Last number divisible by 5 & 9 is " + count);
				}	
			}
		}
	}	
		
	public static void main(String[] args){
		DivisibleBy5And9 num5And9 = new DivisibleBy5And9();
		num5And9.printDivisibleBy5And9(5,100);
	}
}