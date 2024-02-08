package varsha;

public class DivisibleBy5And7 {

	void printNumberInfo(int startIndex, int endIndex) {
		int sum = 0;
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num + " : divisible by 5 & 7");
				sum = sum + num;
				count++;
			}
		}
		System.out.println(sum + " : Sum of number divisible by 5 & 7");
		System.out.println((sum / count) + " : Average of number divisible by 5 & 7");
	}

	public static void main(String[] args) {
		DivisibleBy5And7 divisibleBy5And7 = new DivisibleBy5And7();
		divisibleBy5And7.printNumberInfo(1, 110);
	}
}
