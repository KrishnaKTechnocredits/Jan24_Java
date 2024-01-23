package rohit_sutar;

public class Assignment16 {

	void printSumAndAvg(int startIndex, int endIndex) {
		int additionOfNum = 0;
		int counterTotal = 0;
		int counterNum = 0;
		System.out.println("1st 3 Numbers which are divisible by 5 & 7");
		for(int i=startIndex; i <= endIndex; i++) {
			if(i%5==0 && i%7==0) {
				if(counterNum <= 2) {
					System.out.println(i);
					counterNum++;
				}
				additionOfNum = additionOfNum + i;
				counterTotal++;
			}
		}
		System.out.println("Sum = " + additionOfNum);
		System.out.println("Avgrage = "+(additionOfNum/counterTotal));
	}

	public static void main(String[] arg) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.printSumAndAvg(1, 110);
	}
}
