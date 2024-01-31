package kanchan_ghuge;

class Assignment21 {

	int printSumOfNum(int num) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 6 == 0 && sum <= num) {
				sum = sum + i;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		int countofnum = assignment21.printSumOfNum(150);
		System.out.println(countofnum);
	}
}



