/*Assignment - 15 : 21st Jan'2024
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
-------------------------------------*/
package pallavi_raut;

class DivisibleBy3And4{
	
	void printDivisibleBy3And4(int startIndex, int endIndex){
		System.out.println("First 3 numbers divisible by 3 and 4 is : ");
		int temp=0;
		for (int count = startIndex; count <= endIndex; count ++){
			if (count % 3 == 0 && count % 4 == 0){
				temp++;
				System.out.println(count);
				if( temp == 3){
					break;
				}	
			}
		}
	}	
		
	public static void main(String[] args){
		DivisibleBy3And4 num3And4 = new DivisibleBy3And4();
		num3And4.printDivisibleBy3And4(10,500);
	}
}