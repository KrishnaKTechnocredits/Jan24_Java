package hiral_purohit;

public class DivisionSum {
	void processData(int start, int end) {
		int count = 0;
		int sum = 0;
		int avg = 0;
		System.out.println("Numbers divisible by 5 and 7 is ");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 7 == 0) {
				System.out.println(index);
				count++;
				sum = sum + index;
				avg = sum / count;
			}
		}
		System.out.println("sum of numbers is  " + sum);
		System.out.println("Avg of numbers is  " + avg);
	}

	public static void main(String[] args) {
		DivisionSum division34 = new DivisionSum();
		division34.processData(1, 110);
	}
}