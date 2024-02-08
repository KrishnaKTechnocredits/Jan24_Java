package aanand;

public class Assignment14 {

	void divisibleBy5And10(int startNum, int endNum) {
		int sum  = 0;
		for(int index = startNum; index <= endNum; index++) {
			if(index % 5 ==0 && index % 10 == 0) {
				sum = sum + index;
				
			}
		}
		System.out.println("Expected sum is:" + sum);
	}
	
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.divisibleBy5And10(10, 50);
	}
}
