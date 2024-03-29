package akshay_gaikwad;
/* 1. Print Fibonacci series for n elements.
input : 10
output : 0,1,1,2,3,5,8,13,21,34
11 :54 : 12:04
*/ 

class PrintFibonacciNth{
	
	void printNFibomacciNum(int n){
		int num1 = 0;
		int num2 = 1;
		System.out.print("0 1 ");
		for(int count = 2; count < n; count++){
			int sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
			
		}
	}
	
	public static void main(String [] args){
		new PrintFibonacciNth().printNFibomacciNum(10);
	}
}