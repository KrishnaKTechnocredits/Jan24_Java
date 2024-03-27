package varsha.armStrongNum;

import java.util.Scanner;

//1 Find whether number is ArmStrong
//input : 153
//output : 153 is an armStrong number.

public class CheckTheNumIsArmStrong {

	boolean printNumisArmStrongOrNot(int num) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = num;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (num == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number : ");
		int num = sc.nextInt();
		sc.close();
		boolean flag = new CheckTheNumIsArmStrong().printNumisArmStrongOrNot(num);
		if (flag)
			System.out.println(num + " : is armstrong number");
		else
			System.out.println(num + " : is not armstrong number");
	}
}
