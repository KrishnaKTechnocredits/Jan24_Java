package samiksha;

public class EvenNo1 {

	void printEvenNo(int startR, int endR) {
		int count = 0;
		for (int num = startR; num <= endR; num++) {
			if (num % 2 == 0) {
				System.out.println("output of for loop is " + num);
				count++;
				if (count == 5)
					break;
			}
		}
	}

	void printFirstEvenNO() {
		int count = 0;
		int num = 0;
		while (count < 5) {
			if (num % 2 == 0) {
				System.out.println("output of while loop is " + num);
				count++;

			}
			num++;
		}
	}

	void printEvNo() {
		int count = 0;
		int num = 0;
		do {
			if (num % 2 == 0) {
				System.out.println("output of do while loop is " + num);
				count++;
			}
			num++;
			;
		} while (count < 5);
	}

	public static void main(String[] args) {
		EvenNo1 evenNo1 = new EvenNo1();
		evenNo1.printEvenNo(0, 10);
		evenNo1.printFirstEvenNO();
		evenNo1.printEvNo();
	}
}
