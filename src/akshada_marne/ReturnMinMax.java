package akshada_marne;

public class ReturnMinMax {

	int max = 0;

	void findMax(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("Max" + " = " + max);
	}

	void findMin(int[] numarr) {
		int min = max;
		for (int i = 0; i < numarr.length; i++) {
			if (min > numarr[i]) {
				min = numarr[i];
			}
		}
		System.out.println("Min" + " = " + min);
	}

	public static void main(String args[]) {
		ReturnMinMax returnMinMax = new ReturnMinMax();
		int[] arr = { 10, 20, 50, 60, 30 };
		returnMinMax.findMax(arr);
		returnMinMax.findMin(arr);
	}
}
