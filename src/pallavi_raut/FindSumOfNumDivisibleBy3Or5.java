/*Assignment - 36 : 4th Feb'2024
Return the sum of all the numbers which are divisible by 3 or 5.
input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126
Div by 3 : 6+3+27 = 36
Div by 5 : 5+40 = 45
div by both(AND condition) : 15+30 = 45 -------------------------*/
package pallavi_raut;
class FindSumOfNumDivisibleBy3Or5{
	
	public static void main(String[] args){
		int[] arr = {6, 5, 3, 15, 19, 40, 30, 27, 11};
		FindSumOfNumDivisibleBy3Or5 findSumOfNumDivisibleBy3Or5 = new FindSumOfNumDivisibleBy3Or5();
		findSumOfNumDivisibleBy3Or5.printSumOfNumDivisibleBy3Or5(arr);
	}		
	
	void printSumOfNumDivisibleBy3Or5(int[] num){
		int sum=0;
		for(int index=0; index < num.length ; index ++){
			if( num[index] % 3 == 0 || num[index] % 5 == 0){
				sum= sum + num [index];
			}
		}
		System.out.println("In given array, sum of numbers divisible by 3 or 5  = " + sum);
	}	
}