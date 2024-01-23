//On user defined range print first 3 numbers which is divisible by 3 & 4.


package shridhar_k;

public class Assignment14 {
	void numDivBy3_4(int strNum, int endNum) {
		int count =0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for(int index=strNum; index<=endNum;index++) {
			if(index%3==0 && index%4==0) {
				System.out.println();
				System.out.println(index);
				count++;
				if (count == 3)
					break;
			}
		}
	}
	
	public static void main(String[] arg) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.numDivBy3_4(10, 500);
	}
}
