package garima_s;

public class Assignment_97 {

	void getArmStrongNumber(int[] arr) {
	
		int sum =0;
		System.out.print("Armstrong Numbers : ");
		for (int i = 0; i < arr.length; i++) {
			if (isArmStrongNumber(arr[i])) {
				sum+=arr[i];
				System.out.println(arr[i]);
			}
		}System.out.println("Sum of Armstrong Numbers :"+sum);
	}
	
	


	boolean isArmStrongNumber(int num) {
		int rem = 0;
		int sum = 0;
		int originalNum = num;
		int digit = getDigits(num);
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum += Math.pow(rem, digit);
		}
		if (sum == originalNum) {
			return true;
		}
		return false;
	}

	int getDigits(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 153, 27, 1634, 99 };
		new Assignment_97().getArmStrongNumber(arr);
	}
}
