package lovekesh_mishra;

class SumOfEvenNmuberAssignment35 {
	int evenNumbers(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum = sum + num[i];
			}
		}
		System.out.println("sum of even numbers is---> " + sum);

		return sum;
	}

	public static void main(String[] args) {
		SumOfEvenNmuberAssignment35 ans = new SumOfEvenNmuberAssignment35();
		int[] num = { 3, 6, 9, 11, 15, 20, 4, 26 };
		ans.evenNumbers(num);

	}

}
