package akshay_gaikwad;
/*Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 
12:05 : 12:14
*/

class FibonacciUpToNum{
	
	void printFibonacciUptoNum(int num){
		int num1 = 0, num2 = 1, sum = 0;
		System.out.print("0 1 ");
		while((num1 + num2) < num){
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}
	
	public static void main(String[] args){
		new FibonacciUpToNum().printFibonacciUptoNum(100);
	}
}