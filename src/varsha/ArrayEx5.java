package varsha;

public class ArrayEx5 {

	int getSumOfNumDivBy3Or5(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 3 == 0 && num[index] % 5 == 0) {
				sum = sum + num[index];
			} else if (num[index] % 3 == 0) {
				sum = sum + num[index];
			} else if (num[index] % 5 == 0) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		int num = new ArrayEx5().getSumOfNumDivBy3Or5(arr);
		System.out.println("Total sum of number divisible by 3 or 5 is : " + num);
	}
}