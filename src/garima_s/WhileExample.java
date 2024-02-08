package garima_s;

public class WhileExample {
	void printCount() {
		int sum = 0;
		int num = 1;
		int count = 0;
		while (sum <= 150) {
			if (num % 6 == 0) {
				sum = sum + num;
				count++;
			}
			num++;
		}
		System.out.println("Minimum Numbers required to Create Sum 150 :" + count);
	}

	public static void main(String[] args) {
		WhileExample whileExample = new WhileExample();
		whileExample.printCount();
	}

}
