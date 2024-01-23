package rohini_deshmane;

public class PrintFirstThreeNumberDivsibleBy {
	
	void printFirstThreeNumbers(int startRange, int endRange) {
		int count=1;
		for(int i=startRange; i<= endRange; i++) {
			if(i%3 ==0 && i%4==0) {
				if(count<=3) {
					System.out.println(i);
					count++;
				}
				else
					break;
			}
		}
	}
	
	public static void main(String[] args) {
	
		PrintFirstThreeNumberDivsibleBy printNumber = new PrintFirstThreeNumberDivsibleBy();
		printNumber.printFirstThreeNumbers(10, 100);
	}

}
