package hiral_purohit;
/* Print Fibonacci series for n elements.
input : 10
output : 0,1,1,2,3,5,8,13,21,34*/

public class Assignment_96_p1 {

	void toGetFabonacciSeries(int size) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + "," + n2);
		for (int i = 2; i < size; i++) {
			n3 = n1 + n2;
			System.out.print("," + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		new Assignment_96_p1().toGetFabonacciSeries(10);
	}

}
