package shramika_vaidya;

public class MaxReapeatingWordWithoutUsingMap {

	void getStringCount(String[] arr) {
		int maxCount = 0;
		String name = "";
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (!(arr[i].equals("*"))) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].equalsIgnoreCase(arr[j])) {
						count++;
						arr[j] = "*";
					}
				}
				if (maxCount < count) {
					maxCount = count;
					name = arr[i];

				}
				System.out.println(arr[i] + " has count " + count);
			}
		}
		System.out.println("---------------------------------------------");
		System.out.println("maximum repeating word is -> " + name);
	}

	public static void main(String[] args) {
		String str = "abc xyz abc pqr";
		String[] arr = str.split(" ");
		new MaxReapeatingWordWithoutUsingMap().getStringCount(arr);
	}
}
