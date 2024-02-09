package ashwini_b;

/*
Assignment - 35 : 4th Feb'2024
Return the sum of even index [0,2,4,6]
input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 31
hint 3, 9, 15, 4
 */
public class SumOfEvenIndex {

	int sumOfEvenIndex(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (index % 2 == 0) {
				sum = sum + num[index];
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int[] inputarry = { 3, 6, 9, 11, 15, 20, 4, 26 };
		SumOfEvenIndex sumOfEvenIndex = new SumOfEvenIndex();
		sumOfEvenIndex.sumOfEvenIndex(inputarry);
	}
}
