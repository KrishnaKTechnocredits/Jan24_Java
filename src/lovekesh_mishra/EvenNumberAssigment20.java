package lovekesh_mishra;

class EvenNumberAssignment20 {

	void EvenLoop() {
		int count = 0;
		for (int num = 1; count < 10; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			count++;
		}
		System.out.println("are the first five even numbers");
		System.out.println("------------------------------------------------");
	}

	void EvenWhile() {
		int num = 1;
		int count = 0;
		while (count < 10) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			count++;
			num++;

		}
		System.out.println("are the first five even number");
		System.out.println("--------------------------------------)");
	}

	void EvenDoLoop() {
		int num = 1;
		int count = 0;
		do {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
			count++;

		} while (count < 10);
		System.out.println("are the first five even number");
		System.out.println("-------------------------------------------------------");
	}

	public static void main(String[] args) {
		EvenNumberAssignment20 evenNumberAssignment20 = new EvenNumberAssignment20();
		evenNumberAssignment20.EvenLoop();
		evenNumberAssignment20.EvenWhile();
		evenNumberAssignment20.EvenDoLoop();
	}
}