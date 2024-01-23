package aanand;

public class Assignment18 {
	void reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.reverseString("techno");
	}
}
