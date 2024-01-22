package hiral_purohit;

public class Division59 {

	int lastNum = 0;

	void processData(int startRange, int endRange) {
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0 && index % 9 == 0)
				lastNum = index;
		}
		System.out.println("Last number divisible by 5 & 9 is " + lastNum);
	}

	public static void main(String[] args) {
		Division59 division59 = new Division59();
		division59.processData(5, 100);
	}
}
