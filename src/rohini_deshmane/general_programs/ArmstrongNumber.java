package rohini_deshmane.general_programs;
import java.util.Arrays;
/*
 * Assignment - 97 : 25th March'2024 [45 mins]
11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.

11.2 return sum of all the argStrong number from give array. 
input : {153,27,1634,99}
output : 153 + 1634
 */
import java.util.Scanner;

public class ArmstrongNumber {

	int getDigitCount(int number) {
		int count=0;
		while(number >0) {
			number /=10;
			count++;
		}
		return count;
	}
	
	boolean hasArmstrong(int number) {
		int rem=0;
		int sum=0;
		int count = getDigitCount(number);
		int originalNumber = number;
		while(number > 0) {
			rem = number %10; 
			number /=10; 
			sum += Math.pow(rem, count); 
		}
		
		if(sum == originalNumber) {
			return true;
		} else
			return false;
	}
	
	void sumArmstrongNumbers(int[] num) {
		int sum =0;
		System.out.println("\n Number Array = " + Arrays.toString(num)+" \n Armstrong numbers are = ");
		for(int i=0; i<num.length; i++) {
			if(hasArmstrong(num[i])) {
				sum = sum+num[i];
				System.out.println(num[i]);
			}
		}
		System.out.println("Sum of armstrong number = "+sum);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		if(armstrongNumber.hasArmstrong(number))
		{
			System.out.println(number + " is armstrong number");

		}
		int[] intArr = {153,27,1634,99};
		armstrongNumber.sumArmstrongNumbers(intArr);
	}
}
