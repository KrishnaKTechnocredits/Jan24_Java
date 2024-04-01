package ashwini_b;

/*
Assignment - 97 : 25th March'2024 [45 mins]
11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.

11.2 return sum of all the argStrong number from give array. 
input : {153,27,1634,99}
output : 153 + 1634 i.e 1787
 */
public class Assignment97_ArmstrongNum {

	boolean isArmstrongNum(int num) {
		String temp = String.valueOf(num);
		int length = temp.length();
		double sum = 0;
		for (int i = 0; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			int digit = Character.getNumericValue(ch);
			sum = sum + Math.pow(digit, length);
		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}

	void printsumOfArmNum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			if (isArmstrongNum(num)) {
				// System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int num = 153;
		Assignment97_ArmstrongNum assignment97_ArmstrongNum = new Assignment97_ArmstrongNum();
		boolean isArmstrong = assignment97_ArmstrongNum.isArmstrongNum(num);
		if (isArmstrong) {
			System.out.println(num + " is  an armStrong number.");

		} else {
			System.out.println(num + " is not an armStrong number.");
		}
		int[] array = { 153, 27, 1634, 99 };
		assignment97_ArmstrongNum.printsumOfArmNum(array);

	}

}
