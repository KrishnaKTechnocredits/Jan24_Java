//On user defined range print sum and average of numbers which is divisible by 5 & 7.
package shridhar_k;

public class Assignment16{
	
	void sumAvgDivBy5_7(int strNum, int endNum) {
		int sumOfNum = 0;
		int counterTotal = 0;
		int counterNum = 0;
		System.out.println("1st 3 Numbers div by 5 & 7 are: ");
		for(int index=strNum; index <= endNum; index++) {
			if(index%5==0 && index%7==0) {
				if(counterNum <= 2) {
					System.out.println();
					System.out.println(index);
					counterNum++;
				}
				sumOfNum = sumOfNum + index;
				counterTotal++;
			}
		}
		System.out.println();
		System.out.println("Sum = " + sumOfNum);
		System.out.println();
		System.out.println("Avgrage = "+(sumOfNum/counterTotal));
	}
	
	public static void main(String[] arg) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.sumAvgDivBy5_7(1, 110);
	}
}
	

