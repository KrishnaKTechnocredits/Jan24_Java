package shramika_vaidya;

class FindTotalDigit {

	void printAllDigits() {
		int count = 0;
		String str = "te3c3hn5o2cre3dits";

		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total no of digits in given String = " + count);
	}

	public static void main(String[] args) {
		FindTotalDigit findTotalDigit = new FindTotalDigit();
		findTotalDigit.printAllDigits();
	}
}