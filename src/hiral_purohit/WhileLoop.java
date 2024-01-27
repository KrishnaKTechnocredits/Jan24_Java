package hiral_purohit;
//Find out the minimum numbers required to create sum 150, 
//consider only those numbers which is divisible by 6.

public class WhileLoop {
	int count =0;
	
	void m1(){
		int index =1;
		int sum = 0;
		while (sum <= 150) {
			if (index % 6 ==0) {
				sum = sum + index;
				count++;
		}index++;
		}
		System.out.println("output is " + count);
	}
	
	public static void main( String[] args) {
		WhileLoop whileLoop = new WhileLoop();
		whileLoop.m1();
	}

}
