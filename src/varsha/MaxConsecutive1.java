package varsha;

//Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
//output : 3
//Excepted = 30 min :Actual = 11 min;

public class MaxConsecutive1 {

	void printMaxConsecutive1(int[] arr) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				if (max < count)
					max = count;
			} else {
				count = 0;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		new MaxConsecutive1().printMaxConsecutive1(arr);
	}
}
