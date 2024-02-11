package lovekesh_mishra;

class PositiveDifferenceAssignment34 {

	int difference(int[] num) {
		int sum1 = 0;
		int sum2 = 0;
		int diff = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum1 = sum1 + num[i];
			} else if (num[i] % 2 != 0) {
				sum2 = sum2 + num[i];
			}
		}
		if (sum1 > sum2) {
			diff = sum1 - sum2;
			System.out.println(sum1 + " - " + sum2 + " = " + diff);
		} else if (sum1 < sum2) {
			diff = sum2 - sum1;
			System.out.println(sum2 + " - " + sum1 + " = " + diff);
		}

		return diff;
	}

	public static void main(String[] args) {
		PositiveDifferenceAssignment34 ans = new PositiveDifferenceAssignment34();
		int[] num = { 30, 24, 19, 13, 36, 51, 11, 72 };
		int diff = ans.difference(num);

	}
}
