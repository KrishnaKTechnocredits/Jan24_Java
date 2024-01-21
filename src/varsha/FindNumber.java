package varsha;

public class FindNumber {
	
	void printNumber(int startIndex, int endIndex) {
		for(int num=startIndex; num<=endIndex; num++) {
			if (num%2 == 0) {
				System.out.println("Even numbers are : " + num);
			}
		}
	}
	
	public static void main(String[] args) {
		FindNumber findNumber = new FindNumber();
		findNumber.printNumber(10, 15);
	}

}
