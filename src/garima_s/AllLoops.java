package garima_s;

class AllLoops {

	void forLoop(int start_range, int end_range) {
		int count = 0;
		System.out.println("First Five Even Numbers are in for loop:");
		for (int num = start_range; num <= end_range; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
				if (count >= 5) {
					break;
				}
			}
		}
	}

	void whileLoop(int start_range, int end_range) {
		System.out.println("First Five Even Numbers are in While Loop :");
		int count = 0;
		int num = start_range;
		while (num <= end_range) {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
				if (count >= 5)
					break;
			}
			num++;
		}
	}

	void doWhileLoop(int start_range, int end_range) {
		System.out.println("First Five Even Numbers are in do_While Loop :");
		int count = 0;
		int num = start_range;
		do {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
				if (count >= 5) {
					break;
				}
			}
		} while (num++ <= end_range);
	}

	public static void main(String[] args) {
		AllLoops allLoops = new AllLoops();
		allLoops.forLoop(1, 20);
		allLoops.whileLoop(5, 20);
		allLoops.doWhileLoop(30, 60);
	}
}
