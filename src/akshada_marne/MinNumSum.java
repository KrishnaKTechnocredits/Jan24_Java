package akshada_marne;

public class MinNumSum {
	int count = 0;

	void findNum() {
		int num = 1;
		int sum = 0;

		while (sum <= 150) {
			if (num % 6 == 0) {
				sum = sum + num;
				count++;
			}
			num++;
		}
		System.out.println(count);
	}

	public static void main(String args[]) {
		MinNumSum minNumSum = new MinNumSum();
		minNumSum.findNum();
	}
}
