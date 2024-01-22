package lovekesh_mishra;

class EvenNumberAssignment10 {

	void PrintEven(int startindex, int endindex) {
		for (int num = startindex; num <= endindex; num++) {
			if (num % 2 == 0) {
				System.out.println("Even numbers are---" + num);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumberAssignment10 evenNumberAssignment10 = new EvenNumberAssignment10();
		evenNumberAssignment10.PrintEven(10, 15);
	}
}