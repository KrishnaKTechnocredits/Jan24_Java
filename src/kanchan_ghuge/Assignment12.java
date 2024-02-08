package kanchan_ghuge;

class Assignment12 {

	void processData(int startIndex, int endIndex) {
		for (int num = startIndex; num > endIndex; num--) {
			{
				if (num % 13 == 0) {
					System.out.println(num + " is divisible by 13");
				} else if (num % 7 == 0) {
					System.out.println(num + " is divisible by 7");
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.processData(40, 5);
	}
}
