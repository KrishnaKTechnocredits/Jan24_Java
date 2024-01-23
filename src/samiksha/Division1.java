package samiksha;

public class Division1 {
	int count;
	void printFirstDivNo(int startR, int endR) {
		for(int num = startR; num <= endR; num++){
			if(num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
				if(count==3)
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		Division1 div = new Division1();
		div.printFirstDivNo(10, 500);
	}
}
