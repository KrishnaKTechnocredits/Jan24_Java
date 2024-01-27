package gaurav_garg;

public class MinimunNumberForSumAssignment21 {
	int count;

	void countForSum(int sum) {
		int totalsum = 0;
		int numb1 = 1;
		while (totalsum <= sum) {
			if (numb1 % 6 == 0) {
				totalsum = totalsum + numb1;
				count++;
			}
			numb1++;
		}
		System.out.println(count - 1);
	}

	public static void main(String[] args) {
		MinimunNumberForSumAssignment21 minimunnumberforsumassignment21 = new MinimunNumberForSumAssignment21();
		minimunnumberforsumassignment21.countForSum(150);
	}
}
