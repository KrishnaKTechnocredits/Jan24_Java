package aanand;

public class Assignment12 {
	void divisibleBy7Or13(int startNum, int endNum) {
		for (int index = endNum; index >= startNum; index--) {
			if (index % 7 == 0) {
				System.out.println(index + " divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " divisible by 13");
			}
		}
	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.divisibleBy7Or13(5, 40);
	}
}
