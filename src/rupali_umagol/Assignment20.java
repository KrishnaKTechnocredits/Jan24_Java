package rupali_umagol;

public class Assignment20 {
	int num;
	int count;
	void forLoop(int input) {
		for(int num=0; num <=input ; num++) {
			if(num%2==0) { 
				System.out.println(num);
			count++;
			if(count==5)
				break;
			}
		}
	}
	
	void doWhile(int input) {
		do {
			if(num%2==0) {
				System.out.println(num);
			count++;
			if(count==5)
				break;
			}
		}while(num++ <input);
	}
	
	void whileLoop(int input) {
		int value=0;
		while(value<=input) {
			if(value%2==0)
				System.out.println(value);
			count++;
			if(count==5)
				break;
			value++;
		}                  
	}
	public static void main(String[] args) {
		Assignment20 assignment=new Assignment20();
		assignment.forLoop(10);
		System.out.println("----------------------");
		assignment.doWhile(10);
		System.out.println("----------------------");
		assignment.whileLoop(10);
	}
}

