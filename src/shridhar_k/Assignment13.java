//On user defined range print sum of all the number which is divisible by 5 & 10

package shridhar_k;

public class Assignment13 {
	void sumOfNumDivBy5_10(int strNum, int endNUm) {
		int sum = 0;
		for(int index=strNum; index<=endNUm; index++) {
			if(index%5==0 && index%10==0) {
				sum = sum + index;
			}
		}
		System.out.println("Expected sum is "+ sum);
	}
	
	public static void main(String[] arg) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.sumOfNumDivBy5_10(10, 50);
	}
}
