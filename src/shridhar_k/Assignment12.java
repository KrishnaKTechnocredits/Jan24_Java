//On user defined range print last number which is divisible by 5 & 9
package shridhar_k;

public class Assignment12 {
	void lastNumDivBy5_9(int strNum, int endNum) {
		for(int index=endNum; index>=strNum; index--) {
			if(index%5==0 && index%9==0) {
				System.out.println("Last number divisible by 5 & 9 is " + index);
				break;
			}
		}
	}
	
	public static void main(String[] arg) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.lastNumDivBy5_9(5, 100);
	}
}
