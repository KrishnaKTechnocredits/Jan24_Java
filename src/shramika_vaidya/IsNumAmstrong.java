package shramika_vaidya;

public class IsNumAmstrong {

	int getCount(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	boolean isAmstrongNum(int num) {
		int sum = 0;
		int targetnum = num;
		int count = getCount(num);
		int reminder = 0;

		while (num > 0) {
			reminder = num % 10;
			num /= 10;
			sum += Math.pow(reminder, count);
		}
		if (sum == targetnum) {
			return true;
		}
		return false;
	}

	int getAllAmstrongNum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (isAmstrongNum(num[i]))
				sum += num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		IsNumAmstrong isNumAmstrong = new IsNumAmstrong();
		if (isNumAmstrong.isAmstrongNum(153)) {
			System.out.println("Num is amstrong Number");
		} else
			System.out.println("Num is not amstrong Number");
		int[] arr = { 153, 27, 1634, 99 };
		System.out.println("-----------------------------------------");
		int output = isNumAmstrong.getAllAmstrongNum(arr);
		System.out.println("sum of all amstrong num->" + output);
	}
}
