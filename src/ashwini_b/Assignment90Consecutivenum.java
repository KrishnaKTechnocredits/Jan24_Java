package ashwini_b;

/*
Assignment - 90 : 25th March'2024 [30 mins]
Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3
 */
public class Assignment90Consecutivenum {
	void printConNum(int inputarr[]) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] == 1) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println("max consecutive 1’s in an array: " + max);
	}

	public static void main(String[] args) {
		int[] array = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		Assignment90Consecutivenum assignment90Consecutivenum = new Assignment90Consecutivenum();
		assignment90Consecutivenum.printConNum(array);

	}

}
