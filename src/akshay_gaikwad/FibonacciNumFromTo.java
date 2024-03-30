package akshay_gaikwad;
/* 3 Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89 
12:15 :: 12:20
*/

class FibonacciNumFromTo{
	
	void fibonacciNumFromTo(int start, int end){
		int num1 = 0, num2 = 1, sum = 0;
		while((num1+num2) < end){
			sum = num1 + num2;
			if(sum > start){
				System.out.print(sum + " ");
			}
			num1 = num2;
			num2 = sum;
		}
	}
	
	public static void main(String[] args){
		new FibonacciNumFromTo().fibonacciNumFromTo(50,100);
	}
}