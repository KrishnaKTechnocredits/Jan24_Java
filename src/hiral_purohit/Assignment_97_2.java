package hiral_purohit;/*11.2 return sum of all the argStrong number from give array. 
						input : {153,27,1624,99}
						output : 153 + 1624*/

public class Assignment_97_2 {

	int toGetLength(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	boolean isNumberArmStrong(int num) {
		int digit = 0;
		int result = 0;
		int originalNum = num;
		int length = toGetLength(num);
		while (num > 0) {
			digit = num % 10;
			result += Math.pow(digit, length);
			num /= 10;
		}
		if (originalNum == result) {
			return true;
		}
		return false;
	}

	void toGetAramStrongInArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isNumberArmStrong(arr[i])) {
				sum = sum + arr[i];
			}
		}
		System.out.println("SumOf ArmStrong number is:"+ sum);
	}

	public static void main(String[] args) {
		int[] input = { 153, 27, 1634, 99 };
		System.out.println("...........Variation 2.................");
		new Assignment_97_2().toGetAramStrongInArray(input);
	}

}
