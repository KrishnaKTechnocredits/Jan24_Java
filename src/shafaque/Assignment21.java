package shafaque;

public class Assignment21 {
	int count = 0;

	void checkCount() {

		int sum = 0;
		int num = 1;
		while (sum <= 150) {
			if (num % 6 == 0) {
				sum = sum + num;
				count++;
			}
			num++;
		}
		System.out.println("Minimum numbers required to create sum 150 is " + count);
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.checkCount();
	}

}
