package lovekesh_mishra;

class DivisibleAssignment12 {

	void divisible(int startindex, int endindex) {
		for (int num = startindex; num >= endindex; num--) {
			if (num % 7 == 0) {
				System.out.println(num + "is divisible by 7");
			} else if (num % 13 == 0) {
				System.out.println(num + "is divisible by 13");
			}
		}

	}

	public static void main(String[] args) {
		DivisibleAssignment12 divisibleAssignment12 = new DivisibleAssignment12();
		divisibleAssignment12.divisible(40, 5);
	}
}