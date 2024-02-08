package lovekesh_mishra;

class SumNumbersAssignment21 {

	void Sum() {
		int count = 0;
		int i = 1;
		int sum = 0;
		while (sum <= 150) {
			if (i % 6 == 0) {
				sum = sum + i;
				count++;
			}
			i++;
		}
		System.out.println("Total Numbers required for sum of 150 are----> " + count);

	}

	public static void main(String[] args) {
		SumNumbersAssignment21 sumNumbersAssignment21 = new SumNumbersAssignment21();
		sumNumbersAssignment21.Sum();

	}

}
