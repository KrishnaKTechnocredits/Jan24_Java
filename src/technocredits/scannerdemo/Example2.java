package technocredits.scannerdemo;

import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter rno : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter name : ");
		String name = scanner.next();
		scanner.close();
		
		System.out.println("Name is " + name + ", rno is " + num1);
	}
}
