package hiral_purohit;

/*program 2 (without using map) [extra]
input : abc xyz abc pqr [30 mins]
O/p
abc - 2
xyz - 1
pqr - 1*/
public class Assignment_92_part2 {

	int toGetFreq(String[] arr, String target) {
		int count = 0;
		for (String name : arr) {
			if (name.equals(target)) {
				count++;
			}
		}
		return count;
	}

	boolean isProcessed(String[] arr, String target, int index) {
		for (int i = 0; i < index; i++) {
			if (arr[i].equals(target)) {
				target = arr[i];
				return true;
			}
		}
		return false;
	}

	void toGetFerquencyOfString(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!isProcessed(arr, arr[i], i)) {
				int count = toGetFreq(arr, arr[i]);
				System.out.println(arr[i] + "---> " + count);
			}
		}
	}

	public static void main(String[] args) {
		String input = "abc xyz abc pqr";
		new Assignment_92_part2().toGetFerquencyOfString(input);
	}
}
