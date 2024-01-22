package aanand;

public class Assignment13 {
	void divisibleBy5And9(int startNum,  int endNum) {
		int count=0;
		for(int index = startNum; index <= endNum; index++) {
			if(index % 5 == 0 && index % 9 == 0) {
				count++;
				if(count == 2) {
					System.out.println("Last number disible by 5 and 9 is " + index);
				}
			}
		}
	}
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.divisibleBy5And9(5, 100);
	}
}
