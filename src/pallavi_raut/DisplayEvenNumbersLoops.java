/*Assignment 20 : 25th Jan'2024
1. write a program which print the first 5 even numbers.
[using for loop, while loop, do while loop]

Note: in single Java create 3 different methods
*/
package pallavi_raut;
class DisplayEvenNumbersLoops{
	
	int count=0;
	
	void printEvenNumForLoop(){
		System.out.println("First five Even numbers using For loop are : ");
		for (int num1=1; num1 <30; num1++){
			if (num1 % 2== 0){
				System.out.println(num1);
				count++;
				if (count == 5)
				break;
			}		
		}	
	}	
	
	void printEvenNumWhileLoop(){
		System.out.println("First five Even numbers using While loop are : ");
		int num2=1, count=0;
		while (num2 <30){
			if (num2 % 2== 0){
				System.out.println(num2);
				count++;
				if (count == 5)
				break;
			}
		num2 ++;
		}
	}

	void printEvenNumDoWhileLoop(){
		System.out.println("First five Even numbers using DoWhile loop are : ");
		int num3=1, count=0;
		do{
			if (num3 % 2== 0){
				System.out.println(num3);
				count++;
				if (count == 5)
				break;
			}
			num3 ++;
		}	
		while (num3 <30);	
	}	
				
	public static void main(String[] args){
		DisplayEvenNumbersLoops evennum= new DisplayEvenNumbersLoops();
		evennum.printEvenNumForLoop();
		System.out.println("----------------------------------------------");
		evennum.printEvenNumWhileLoop();
		System.out.println("----------------------------------------------");
		evennum.printEvenNumDoWhileLoop();
	}
}