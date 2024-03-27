package rohini_deshmane.general_programs;
/*
1. Print Fibonacci series for n elements.
input : 10 //12.36
output : 0,1,1,2,3,5,8,13,21,34
num1 = 0    
num2 = 1 
 */
import java.util.Scanner;

public class FibonacciSeriesforNelements {

	void printFibonacciSeries(int number) {
		int number1 = 0;
		int number2 = 1;
		int number3;
		
		System.out.print("\n\nFibbonicci Series \n"+number1+ ","+ number2);
		for(int i=2; i<number; i++) {
			number3 = number1+number2;
			System.out.print(","+number3);
			number1 = number2;
			number2 = number3;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number range ");
		int number = sc.nextInt();
		FibonacciSeriesforNelements series = new FibonacciSeriesforNelements();
		series.printFibonacciSeries(number);
	}
}
