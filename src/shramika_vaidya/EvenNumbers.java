package shramika_vaidya;

class EvenNumbers {

	void printEvenNumbers(int startNum, int endNum) {
		System.out.println("By using for loop Even numbers are");
		int count = 0;
		for (int num = startNum; num <= endNum; num++) {
			if (num % 2 == 0) {
				count++;
				System.out.println(num);
			}
			if (count == 5)
				break;
		}
	}

	void printData(int startInput, int endInput) {
		System.out.println("By using While loop Even numbers Are ");
		int count = 0;
		int num = startInput;
		while (num <= endInput) {
			num++;

			if (num % 2 == 0) {
				count++;
				System.out.println(num);
			}
			if (count == 5)
				break;
		}
	}

	void setData(int startIndex, int endIndex) {
		System.out.println("By using  do While loop Even numbers Are ");
		int count = 0;
		int num = startIndex;
		do {
			num++;
			if (num % 2 == 0) {
				count++;
				System.out.println(num);
			}
			if (count == 5)
				break;

		} while (num <= endIndex);
	}

	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.printEvenNumbers(10, 20);
		evenNumbers.printData(20, 30);
		evenNumbers.setData(30, 40);
	}
}
