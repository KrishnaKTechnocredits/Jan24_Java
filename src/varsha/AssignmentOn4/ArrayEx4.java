package varsha.AssignmentOn4;

//Assignment - 35 : 4th Feb'2024
//
//Return the sum of even index [0,2,4,6]
//
//input : {3, 6, 9, 11, 15, 20, 4, 26}
//Output : 31
//
//hint 3, 9, 15, 4

public class ArrayEx4 {

	int getsumOfEvenNum(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index += 2) {
			sum = sum + num[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
		int num = new ArrayEx4().getsumOfEvenNum(arr);
		System.out.println("The sum of even index in the given array is : " + num);
	}
}
