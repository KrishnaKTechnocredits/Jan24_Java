package rohini_deshmane.general_programs;
/*
 2. Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 
 */
public class FibonacciWithRange {

	void printFibonacciSeries() {
		int number1 = 0;
		int number2 = 1;
		int number3=0;
		
		System.out.print("Fibbonicci Series \n"+number1+ ","+ number2);
		for(int i=2; number3 <100; i++) {
			number3 = number1+number2;
			if(number3 <100) {
				System.out.print(","+number3);
				
			}
			number1 = number2;
			number2 = number3;
		}
	}
	
	public static void main(String[] args) {
		FibonacciWithRange withRange = new FibonacciWithRange();
		withRange.printFibonacciSeries();
	}
}
