package puja_poreddiwar;

public class MinNumToSum150 {

	int sum = 0;
	int num = 1;
	int count = 0;

	void whileLoopCountNum(int target) {
		while (sum <= target) {
			if (num % 6 == 0) {
				sum = sum + num;
				count++;
			}
			num++;
		}
		System.out.println("Minimum Numbers required to Create Sum 150, which is divisible by 6 are : " + count);
	}

	public static void main(String[] agrs) {
		MinNumToSum150 minNumToSum50 = new MinNumToSum150();
		minNumToSum50.whileLoopCountNum(150);
	}
}
