package hiral_purohit;

/*Return all the numbers of Fibonacci series between 50 to 100.
output : 55,89 */
public class Assignment_96_p3 {

	void toGetFebonacciSeries(int start, int end) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		String str = "";
		for (int i = 2; i < end; ++i) {
			n3 = n1 + n2;
			if (n3 > start && n3 < end) {
				str = str + n3 + " ";
			}
			n1 = n2;
			n2 = n3;
		}
		System.out.println(str.trim());
	}

	public static void main(String[] args) {
		new Assignment_96_p3().toGetFebonacciSeries(50, 100);
	}
}
