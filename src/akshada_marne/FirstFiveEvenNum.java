package akshada_marne;

public class FirstFiveEvenNum {
	
	void loopIf() {
		for(int num=1; num<=10; num++) {
		if(num%2==0) {
			System.out.println("First five even numbers using if condition are: " + num);
			}
		}
	}
	
	
	void loopWhile() {
		int num=1;
		while(num<=10) {
		if(num%2==0) 
			 System.out.println("First five even numbers using while loop are: "+ num);
		num++;
			}
	}
	
		
	void loopDoWhile() {
		int num=1;
		do{
			if(num%2==0)
				System.out.println("First five even numbers using do-while loop are: " + num);
			num++;
		}
			while(num<=10);
	}
	
	public static void main(String args[]) {
		FirstFiveEvenNum firstFiveEvenNum= new FirstFiveEvenNum();
		firstFiveEvenNum.loopIf();
		firstFiveEvenNum.loopWhile();
		firstFiveEvenNum.loopDoWhile();
	}
}
