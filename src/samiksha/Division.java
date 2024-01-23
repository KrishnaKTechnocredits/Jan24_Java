package samiksha;

public class Division {
	
	void printDivNo(int startR, int endR) {
		for(int index = startR; index <= endR; index++) {
			if(index % 5 ==0 && index % 3 == 0) {
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args) {
		Division division = new Division();
		division.printDivNo(5, 40);
	}
}
