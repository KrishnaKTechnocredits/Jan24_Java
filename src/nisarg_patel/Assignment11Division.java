package nisarg_patel;

public class Assignment11Division {

	void printDivNo(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println("Divisible by 5 & 3, numbers are : " + index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment11Division assignment11Division = new Assignment11Division();
		assignment11Division.printDivNo(5, 40);
	}

}
