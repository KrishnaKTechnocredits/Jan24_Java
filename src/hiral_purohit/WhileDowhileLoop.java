package hiral_purohit;

public class WhileDowhileLoop {

	void forLoop(int num1, int num2) {
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
				if (count >= 5) {
					break;
				}
			}
		}
	}

	void whileLoop(int num1, int num2) {
		int count =0;
		int i = num1;
		while(i <= num2) {
			if(i % 2 == 0) {
				System.out.println(i);
				count++;
				if(count >= 5) {
					break;
				}
			}
			i++;
			}	
		}	
			
	void doWhileLoop(int num1, int num2) {
			int count = 0;
			int i = num1;
			do {
				if (i % 2 == 0)
				{System.out.println(i);
				count++;
				if(count >= 5) {
					break;
					}
				}
			}while(i++ <= num2);
		}

	public static void main(String[] args) {
		WhileDowhileLoop whileDowhileLoop = new WhileDowhileLoop();
		System.out.println("output of forLoop is:");
		whileDowhileLoop.forLoop(1, 10);
		System.out.println("output of whileLoop is:");
		whileDowhileLoop.whileLoop(20,40);
		System.out.println("output of doWhileLoop is:");
		whileDowhileLoop.doWhileLoop(5,15);
	}
}
