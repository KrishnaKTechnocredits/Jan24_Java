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
		while(number1 < 100) {
			if(number1>50 && number1<100)
				System.out.print(number1+",");
			number3 = number1+number2;
			number1 = number2;
			number2 = number3;
		}
	}
	
	public static void main(String[] args) {
		FibonacciesNumberBetweenRange betweenRange = new FibonacciesNumberBetweenRange();
		betweenRange.printFibonacciSeries();
	}
}
