package nisarg_patel;

public class Assignment10Even {

	void printEvenNum(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println("Even numbers are : " + index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment10Even assignment10Even = new Assignment10Even();
		assignment10Even.printEvenNum(10, 15);
	}
}
