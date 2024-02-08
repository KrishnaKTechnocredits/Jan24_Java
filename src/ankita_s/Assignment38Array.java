package ankita_s;

public class Assignment38Array {

	void printMinandMax(int[] num) {
		int max = num[0];
		int min = num[0];
		for (int index = 1; index < num.length; index++) {
			if (num[index] > max) {
				max = num[index];
			}
			if (num[index] < min) {
				min = num[index];
			}
		}
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 60, 30 };
		Assignment38Array ass38 = new Assignment38Array();
		ass38.printMinandMax(arr);
	}
}
