package dharma;

public class Assignment79 {

	void printNum(int rowCount) {
		for (int rowIndex = 1; rowIndex < rowCount+1; rowIndex++) {
			for (int columnIndex = 1; columnIndex <= rowIndex; columnIndex++) {
				System.out.print(rowIndex  + " ");
			}
			System.out.println("");
		}
	}
	
	void printPattern(int rowCount) {
		for (int rowIndex = 0; rowIndex <= rowCount; rowIndex++) {
			for (int columnIndex = 0; columnIndex <= rowIndex; columnIndex++) {
				if (rowIndex % 2 == 0) {
					System.out.print("* ");
				} else
					System.out.print("# ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Assignment79 ass79 = new Assignment79();
		ass79.printNum(4);
		System.out.println("");
		ass79.printPattern(4);
	}
}
