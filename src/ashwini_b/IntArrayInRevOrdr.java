package ashwini_b;

/*
 Print all the given int array in the reverse order.
input : {10, 20, 13, 27, 29, 13, 6}
Output : 6
		 13
		 29
		 27
		 13
		 20
		 10
 */
public class IntArrayInRevOrdr {

	void printArryInRev(int[] num) {
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		IntArrayInRevOrdr intArrayInRevOrdr = new IntArrayInRevOrdr();
		int[] arr = { 10, 20, 13, 27, 29, 13, 6 };
		intArrayInRevOrdr.printArryInRev(arr);
	}
}
