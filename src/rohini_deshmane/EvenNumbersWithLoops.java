package rohini_deshmane;

public class EvenNumbersWithLoops {
	
	void forLoopExample(int firstinput, int secondinput) {
		int firstFive =0; 
		for(int i=firstinput; i<= secondinput; i++) {
			if(i%2 ==0 && firstFive <5) {
				System.out.println(i);
				firstFive++;
			}
		}
	}
	
	void doWhileExample(int firstinput, int secondinput) {
		int i=firstinput, firstFive =0;
		System.out.println();
		do {
			if(i%2==0 && firstFive <5) {
				System.out.println(i);
				firstFive++;
			}
			i++;
		}while(i<=secondinput && firstFive <5);
	}
	
	void whileExample(int firstinput, int secondinput) {
		int i= firstinput, firstFive =0;
		System.out.println();
		while (i<=secondinput && firstFive <5) {
			if(i%2 ==0) {
				System.out.println(i);
				firstFive++;
			}
			i++;
			
		}
	}
	
	public static void main(String[] args) {
		EvenNumbersWithLoops evenNumbersWithLoops = new EvenNumbersWithLoops();
		evenNumbersWithLoops.forLoopExample(12, 30);
		evenNumbersWithLoops.doWhileExample(12, 30);
		evenNumbersWithLoops.doWhileExample(12, 30);
	}
}
