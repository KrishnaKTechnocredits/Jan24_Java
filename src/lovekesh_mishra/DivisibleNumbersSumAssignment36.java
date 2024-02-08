package lovekesh_mishra;

class DivisibleNumbersSumAssignment36 {

	int divisible(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0 || num[i] % 5 == 0) {
				sum = sum + num[i];

			}
		}
		System.out.println("sum of all numbers divisible are " + sum);

		return sum;
	}

	public static void main(String[] args) {
		DivisibleNumbersSumAssignment36 ans = new DivisibleNumbersSumAssignment36();
		int[] num = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		ans.divisible(num);
	}

}
