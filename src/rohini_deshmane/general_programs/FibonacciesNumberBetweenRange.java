package rohini_deshmane.general_programs;
/*
 3 Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89 
 */
public class FibonacciesNumberBetweenRange {

	void printFibonacciSeries() {
		int number1 = 0;
		int number2 = 1;
		int number3=0;
		
		System.out.print("Fibbonicci Series numbers between 50 to 100 \n");
		for(int i=2; number3 <100; i++) {
			number3 = number1+number2;
			if(number3 > 50 && number3 <100) {
				System.out.print(number3+",");
				
			}
			number1 = number2;
			number2 = number3;
		}
	}
	
	public static void main(String[] args) {
		FibonacciesNumberBetweenRange betweenRange = new FibonacciesNumberBetweenRange();
		betweenRange.printFibonacciSeries();
	}
}
