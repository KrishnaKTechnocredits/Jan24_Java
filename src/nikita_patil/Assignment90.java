package nikita_patil;

public class Assignment90 {
	int toGetMostConsequentOne(int[] arr, int n) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count = 0;
			} else {
				count++;
				if (maxCount < count) {
					maxCount = count;
				}
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		int max = new Assignment90().toGetMostConsequentOne(input, 1);
		System.out.println("most Consequent 1 comes for " + max + " times");
	}

}