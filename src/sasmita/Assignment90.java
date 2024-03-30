/*Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3 
 */
package sasmita;

public class Assignment90 {

	void findMaxconsecutive(int[] arr) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				if (maxCount < count)
					maxCount = count;
			} else
				count = 0;
		}
		System.out.println(maxCount);
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		new Assignment90().findMaxconsecutive(arr);
	}
}
