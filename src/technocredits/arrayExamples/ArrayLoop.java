package technocredits.arrayExamples;

public class ArrayLoop {

	int getSumOfHigherNumbers(int[] arr) {
		int sum = 0;
		int index = 0;
		for (int num : arr) {
			System.out.println(num + "->" + index);
			sum = sum + num;
			index++;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int[] data = { 10, 20, 15, 2, 6, 8, 19 };
		int total = new ArrayLoop().getSumOfHigherNumbers(data);
		System.out.println(total);
	}
}
