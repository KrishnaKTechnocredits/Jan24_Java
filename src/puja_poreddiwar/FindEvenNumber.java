package puja_poreddiwar;

public class FindEvenNumber {

	void forloopEvenNo(int startRange, int endRange) {
		int count = 0;
		System.out.println("For_loop - first 5 Even numbers are: ");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
			}
			if (count == 5) {
				break;
			}
		}
	}

	void whileloopEvenNo() {
		System.out.println("While_loop- first 5 Even numbers are: ");
		int count = 0;
		int num = 2;
		while (count < 5) {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	void dowhileloopEvenNo(int input) {
		System.out.println("do_while_loop- first 5 Even numbers are: ");
		int count = 0;
		int num = 1;
		do {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
			}
			num++;
		} while (count < input);
	}

	public static void main(String[] args) {
		FindEvenNumber findEvenNumber = new FindEvenNumber();
		findEvenNumber.forloopEvenNo(1, 20);
		System.out.println("-----------------------------");
		findEvenNumber.whileloopEvenNo();
		System.out.println("-----------------------------");
		findEvenNumber.dowhileloopEvenNo(5);
	}
}
