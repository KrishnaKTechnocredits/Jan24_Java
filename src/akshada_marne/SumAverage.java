package akshada_marne;

public class SumAverage {

	int sum = 0;
	int avg = 0;
	int count = 0;

	void condition(int start, int end) {
		for (int num = start; num <= end; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				sum = sum + num;
				count = count + 1;
				avg = sum / count;
			}
		}
	}

	void print() {
		System.out.println("Sum of numbers divisible by 5 & 7 is: "+sum);

		System.out.println("Average of numbers divisible by 5 & 7 is: "+avg);
	}

	public static void main(String args[]) {
		SumAverage sumAverage = new SumAverage();
		sumAverage.condition(1, 110);
		sumAverage.print();
	}
}
