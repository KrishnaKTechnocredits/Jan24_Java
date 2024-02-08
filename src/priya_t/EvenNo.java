package priya_t;

public class EvenNo {

	public void printEvenNo(int startIndex, int endIndex) {

		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 2 == 0) {

				System.out.println("Even Numbers are:" + num);
			}
		}

	}

	public static void main(String[] args) {
		EvenNo number = new EvenNo();
		number.printEvenNo(10, 15);

	}

}
