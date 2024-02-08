package lovekesh_mishra;

class DivisibleAssignment16 {

	void divisible(int startindex, int endindex) {
		int count = 0;
		int sum = 0;
		int avg = 0;
		for (int num = startindex; num <= endindex; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(" numbers divisible are--" + num);
				count++;
				sum = sum + num;
				avg = sum / count;
			}
		}
		System.out.println(" sum =" + sum);
		System.out.println(" average =" + avg);
	}

	public static void main(String[] args) {
		DivisibleAssignment16 divisibleAssignment16 = new DivisibleAssignment16();
		divisibleAssignment16.divisible(1, 110);
	}
}
