/*Assignment 20 : 25th Jan 2024
Write a program to print first 5 even numbers using for/while/do while loops*/

package sarang_kulkarni;

public class EvenNumbers {
	static int count=0;
	public static void main(String[] args) {
		 EvenNumbers evenNumbers = new EvenNumbers();
		 System.out.println("Printing first 5 Even numbers using for loop\n");
		 evenNumbers.formethod();
		 System.out.println("\nPrinting first 5 Even numbers using while loop\n");
		 evenNumbers.whilemethod();
		 System.out.println("\nPrinting first 5 Even numbers using do while loop\n");
		 evenNumbers.dowhilemethod();
	}

	public void formethod() {
			for(int i=0;i<20;i++) {
			if(i % 2 == 0) {
				count++;
				System.out.println(count+" Even number is "+i);
			}
			if(count==5)
				break;
		}
	}
	
	public void whilemethod() {
		int i=0;
		count=0;
		while(count<5) {
			if(i % 2 == 0) {
				count++;
				System.out.println(count+" Even number is "+i);
			}
			i++;
		}
	}
	
	public void dowhilemethod() {
		int i = 0;
		count=0;
		do {
			if(i % 2 == 0) {
				count++;
				System.out.println(count+" Even number is "+i);
			}
			i++;
		}while(count<5);
	}
}