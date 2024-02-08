package kanchan_ghuge;

class Assignment20 {

	void forLoop(int num1, int num2) {
		System.out.println("First Five Even Numbers are in for loop:");
		int count = 0;

		for (int i = num1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
				if (count == 5)
					break;
			}
		}
	}

	void whileLoop(int num1, int num2) {
		System.out.println("First Five Even Numbers are in While loop:");
		int count = 0;
		while (num1 <= num2) {
			if (num1 % 2 == 0) {
				System.out.println(num1);
				count++;
				if (count == 5)
					break;
			}
			num1++;
		}
	}

	void doWhileLoop(int num1, int num2) {
		System.out.println("First Five Even Numbers are in Do While loop:");
		int count = 0;
		do {
			if (num1 % 2 == 0) {
				System.out.println(num1);
				count++;
				if (count == 5) {
					break;
				}
			}
		} while (num1++ <= num2);

	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.forLoop(1, 20);
		assignment20.whileLoop(1, 10);
		assignment20.doWhileLoop(1, 50);
	}
}
