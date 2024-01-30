package rohit_sutar;

public class Assignment20 {
	
	void forMethod(int firstNum, int lastNum) {
		int count = 0;
		System.out.println("Even Number Using For Loop");
		
		for(int i = firstNum; i <= lastNum ; i++){
			if(i % 2 == 0){
				System.out.println(i);
				count++;
			}
			if(count >= 5){
				break;
			}
		}
	}
	
	void whileMethod(int firstNum, int lastNum) {
		int count = 0;
		int i = firstNum;
		System.out.println();
		System.out.println("Even Number Using While Loop");
		
		while(i <= lastNum){
			if(i % 2 == 0){
				System.out.println(i);
				count++;
			}
			if(count == 5) {
				break;
			}
			i++;
		}
	}
	
	void doWhileMethod(int firstNum, int lastNum) {
		int count = 0; 
		int i = firstNum;
		System.out.println();
		System.out.println("Even Number Using Do While Loop");
		
		do{
			if(i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if(count == 5) {
				break;
			}
			i++;
		}while(i <= lastNum);
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.forMethod(10, 60);
		assignment20.whileMethod(5, 20);
		assignment20.doWhileMethod(30, 50);
	}
}
