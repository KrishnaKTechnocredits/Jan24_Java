package hiral_purohit;

public class Division510 {

	void processData(int startRange, int endRange) {
		int sum = 0;
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0 && index % 10 == 0)
				sum = sum + index;
		}
		System.out.println("Expected sum is " + sum);
	}

	public static void main(String[] args) {
		Division510 division510 = new Division510();
		division510.processData(10, 50);
	}
}
