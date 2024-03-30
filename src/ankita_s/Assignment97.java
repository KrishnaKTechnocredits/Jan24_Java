package ankita_s;

public class Assignment97 {
	int getCount(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	boolean getArmStrongNumber(int num) {
		int sum = 0;
		int originalNum = num;
		int count = getCount(num);
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			num /= 10;
			sum += Math.pow(rem, count);
		}
		if (sum == originalNum) {
			return true;
		}
		return false;
	}

	int getAllArmStrongNum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (getArmStrongNumber(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment97 ass97 = new Assignment97();
		if (ass97.getArmStrongNumber(153)) {
			System.out.println("number is an ArmStrong number");
		} else
			System.out.println("Number is not an ArmStrong number");
		int[] input = { 153, 27, 1634, 99 };
		System.out.println("---------------------------------");
		int output = ass97.getAllArmStrongNum(input);
		System.out.println("Sum of All ArmStrong num from Array is : " + output);
	}
}
