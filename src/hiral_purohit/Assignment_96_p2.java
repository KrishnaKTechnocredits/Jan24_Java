package hiral_purohit;
/*2. Print all the numbers of Fibonacci series where in series number should not cross 100.
input : 100
output : 0,1,1,2,3,5,8,13,21,34,55,89 */

public class Assignment_96_p2 {
	void toGetFebonacciNum(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + "," + n2);
		int n3 = 0;
		for (int i = 2;; i++) {
			n3 = n1 + n2;
			if (n3 > n) {
				break;
			}
			System.out.print("," + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		new Assignment_96_p2().toGetFebonacciNum(100);
	}

}
