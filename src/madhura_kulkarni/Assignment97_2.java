package madhura_kulkarni;

public class Assignment97_2 {
	int getNumberOfDigits(int tempNum) {
		int digitCount = 0;
		while (tempNum > 0) {
			tempNum = tempNum / 10;
			digitCount++;
		}
		return digitCount;
	}
	boolean checkIfNumberIsArmstrong(int num) {
		int sum = 0, remainder = 0;
		int originalNum=num;
		int digitsCount = getNumberOfDigits(num);
		while (num > 0) {
			remainder = num % 10;
			sum += (Math.pow(remainder, digitsCount));
			num = num / 10;
		}
		if (originalNum == sum) 
			return true;
		else
			return false;
	}

	void getSumOfAllArmStrongNumbers(int[] numArr) {
		int sum=0;
		for(int i=0;i<numArr.length;i++) {
			if(checkIfNumberIsArmstrong(numArr[i]))
				sum+=numArr[i];
		}
		System.out.println("Sum of all Armstrong numbers in given array is "+sum);
	}
	public static void main(String[] args) {
		int[] num = { 153, 27, 1634, 99 };
		new Assignment97_2().getSumOfAllArmStrongNumbers(num);
	}

}
