package hiral_purohit;

public class Division34 {

	void processData(int startRange, int endRange) {
		int count = 0;
		System.out.println("First 3 numbers divisible by 3 and 4 is:");
		for (int index = startRange; endRange >= index; index++) {
			if (index % 3 == 0 && index % 4 == 0) {
				System.out.println(index);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Division34 division34 = new Division34();
		division34.processData(10, 500);

	}
}