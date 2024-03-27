/*Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0,1,1,1,1]
output : 3*/
package rupali_umagol;

public class Assignment90 {

	void getMaxCountOne(int[] input) {
		int maxCount = 0;
		int currentCount = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 1) {
				currentCount++;
				if (maxCount < currentCount) {
					maxCount = currentCount;
				}
			} else {
				currentCount = 0;
			}
		}
		System.out.println("Max Consecutive 1's : "+maxCount);
	}

	public static void main(String[] args) {
		int[] input = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
		new Assignment90().getMaxCountOne(input);

	}
}
