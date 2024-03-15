package technocredits.scannerdemo;

import java.util.Scanner;

public class Example1 {
	
	void printPattern(int n) {
		for(int rowIndex=1;rowIndex<=n;rowIndex++) {
			for(int colIndex=1;colIndex<=rowIndex;colIndex++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void add() {
		
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of rows to be printed : ");
		int rows = sc.nextInt();
		System.out.println("Hi");
		example1.printPattern(rows);
	}
}
