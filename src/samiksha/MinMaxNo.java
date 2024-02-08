package samiksha;

public class MinMaxNo {

	int printMaxNo(int[] num) {
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (max < num[index]) {
				max = num[index];
			}
		}
		return max;
	}

	int printMinNo(int[] num) {
		int min = num[0];
		for (int index = 0; index < num.length; index++) {
			if (min > num[index]) {
				min = num[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 50, 60, 30 };
		MinMaxNo minMaxNo = new MinMaxNo();
		int max = minMaxNo.printMaxNo(input);
		System.out.println("max no is " + max);
		int min = minMaxNo.printMinNo(input);
		System.out.println("min no is " + min);
	}
}
