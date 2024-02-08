package varsha.AssignmentOn4;

//Assignment - 32 : 4th Feb'2024	
//Print all the given int array in the reverse order.
//
//input : {10, 20, 13, 27, 29, 13, 6}
//Output : 6
//		 13
//		 29
//		 27
//		 13
//		 20
//		 10

public class ArrayEx1 {

	void printReverseNum(int[] arr) {
		for (int index = arr.length - 1; index >= 0; index--) {
			System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		ArrayEx1 arrayEx1 = new ArrayEx1();
		int[] num = { 10, 20, 13, 27, 29, 13, 6 };
		arrayEx1.printReverseNum(num);
	}
}