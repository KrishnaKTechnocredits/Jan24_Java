package aanand;

public class Assignment20 {

	void forLoop(int num) {
		int count = 0;
		System.out.println("First 5 even number are (through For Loop): ");
		for (int index = num;; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
				count++;
			}
			if (count == 5) {
				break;
			}
		}
	}

	void whileLoop(int num) {
		int count = 0;
		System.out.println("First 5 even number are (through While Loop): ");
		while (num > 0) {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
				if (count == 5) {
					break;
				}
			}
			num++;
		}
	}

	void doWhileLoop(int num) {
		int count = 0;
		System.out.println("First 5 even number are (through Do While Loop): ");
		do {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
				if (count == 5) {
					break;
				}
			}
			num++;
		} while (num > 0);
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.forLoop(10);
		assignment20.whileLoop(10);
		assignment20.doWhileLoop(10);
	}
}