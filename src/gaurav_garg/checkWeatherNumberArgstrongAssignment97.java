package gaurav_garg;

public class checkWeatherNumberArgstrongAssignment97 {

	void checkTheNumberIsArgstron(int num) {
		int count = 0;
		int number = 0;
		int num2 = num;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		num = num2;
		while (num2 > 0) {
			int remainder = num2 % 10;
			number = (int) (number + Math.pow(remainder, count));
			num2 = num2 / 10;
		}
		if (num == number) {
			System.out.println(number + " is a Argstron Number");
		} else {
			System.out.println(number + " is not a Argstron Number");
		}
	}

	boolean weatherTheNumberIsArgstron(int num) {
		int count = 0;
		int number = 0;
		int num2 = num;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		num = num2;
		while (num2 > 0) {
			int remainder = num2 % 10;
			number = (int) (number + Math.pow(remainder, count));
			num2 = num2 / 10;
		}
		if (num == number) {
			return true;
		} else {
			return false;
		}
	}

	void ReturnTheSumOfNumberIsArgstronArray(int aa[]) {
		int sum = 0;
		for (int i = 0; i < aa.length; i++) {
			boolean f = weatherTheNumberIsArgstron(aa[i]);
			if (f == true) {
				sum = sum + aa[i];
			}
		}
		System.out.println("Sum of number In Argstron " + sum);
	}

	public static void main(String[] args) {
		new checkWeatherNumberArgstrongAssignment97().checkTheNumberIsArgstron(5);
		int input[] = { 153, 27, 1634, 99 };
		new checkWeatherNumberArgstrongAssignment97().ReturnTheSumOfNumberIsArgstronArray(input);
	} 
}
