package shravani_rapelli;

public class Assignment96 {

	void toPrintFibonacciSeriesForNElements(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print("Print the fibonacci series of n elements :");
		System.out.print(n1+ "," + n2);
		for(int i=3; i<=n; i++) {
			int result = n1 + n2;
			System.out.print(","+ result);
			n1 = n2;
			n2 = result;
		}
	}
	
	void toPrintFinonacciSeriesWhichNotCross100(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.println();
		System.out.print("Print fibonacci Series which should be less than " + n + " : ");
		System.out.print(n1+","+ n2);
		int result = n1 + n2;
		while(result <= n) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
			if(result > n) {
				break;
			}
			System.out.print(","+ result);
		}
	}
	
	void toPrintAllTheNumbersOfFibonacciSeriesBetweenRange(int r1,int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.println();
		System.out.print("Print fibonacci Series which should be between range " + r1 + " and " + n + ":");
		int result = n1 + n2;
		if(r1 == 1) {
			System.out.print(n1+ " " + n2 +" "+ n2);
		}
		while (result <= n) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
			if(result > r1 && result < n) {
				System.out.print(" "+ result);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment96 assgn96 = new Assignment96();
		assgn96.toPrintFibonacciSeriesForNElements(10);
		assgn96.toPrintFinonacciSeriesWhichNotCross100(100);
		assgn96.toPrintAllTheNumbersOfFibonacciSeriesBetweenRange(50, 100);
	}
}
