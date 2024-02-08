//Assignment 21 : Find out the minimum numbers required to create sum 150, consider only those numbers which is divisible by 6.
//output : 7

package padmaja;

public class MinimumNosForGivenSum {

	void minimumNo(int num) {
		int count = 0;
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

	public static void main(String[] args) {
		MinimumNosForGivenSum minimumNosForGivenSum = new MinimumNosForGivenSum();
		minimumNosForGivenSum.minimumNo(1);
	}
}
