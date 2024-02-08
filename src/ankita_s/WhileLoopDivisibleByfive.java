package ankita_s;

public class WhileLoopDivisibleByfive {
	int sum = 0;
	int num = 1;
	int count = 0;

	void printWhileLoopDivisibleByfive() {
		while (sum < 150) {
			if (num % 6 == 0) {
				sum += num;
				count++;
			}
			num++;
		}
		System.out.println("Output:- " + count);
	}

	public static void main(String[] args) {
		WhileLoopDivisibleByfive whileLoopDivisibleByfive = new WhileLoopDivisibleByfive();
		whileLoopDivisibleByfive.printWhileLoopDivisibleByfive();
	}
}
