package shridhar_k;

public class Assignment79 {
	
	void printNumColumnWise(int rowCount) {
		for(int rowIndex =0;rowIndex<= rowCount;rowIndex++) {
			for (int columnIndex=0;columnIndex<=rowIndex;columnIndex++) {
				System.out.print(rowIndex + 1 + " ");
			}
			System.out.println("");
		}
	}
	
	void printPattern(int rowCount) {
		for(int rowIndex =0;rowIndex <= rowCount;rowIndex++) {
			for (int columnIndex=0;columnIndex<=rowIndex;columnIndex++) {
				if(rowIndex %2 ==0) {
					System.out.print("* ");
				}else
					System.out.print("# ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Assignment79 assignment79 = new Assignment79();
		assignment79.printNumColumnWise(4);
		System.out.println("");
		assignment79.printPattern(4);
	}
}
