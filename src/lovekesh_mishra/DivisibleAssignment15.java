package lovekesh_mishra;

class DivisibleAssignment15 {

	void divisible(int startindex, int endindex) {
		int count = 0;
		for (int num = startindex; num <= endindex; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println("first 3 numbers divisible by 3 and 4 --" + num);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		DivisibleAssignment15 divisibleAssignment15 = new DivisibleAssignment15();
		divisibleAssignment15.divisible(10, 500);
	}
}