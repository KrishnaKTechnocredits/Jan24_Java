/*Assignment - 14: 21st Jan'2024
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150
-------------------------------------*/
package pallavi_raut;

class DivisibleBy5And10{
	
	void sumDivisibleBy5And10(int startIndex, int endIndex){
		int sum = 0;
		for (int count = startIndex; count <= endIndex; count ++){
			if (count % 5 == 0 && count % 10 == 0){
				sum = sum + count;
			}	
		}
		System.out.println("Expected sum is " + sum);
	}
		
	public static void main(String[] args){
		DivisibleBy5And10 num5And10 = new DivisibleBy5And10();
		num5And10.sumDivisibleBy5And10(10,50);
	}
}
