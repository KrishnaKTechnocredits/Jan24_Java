package samiksha;

public class EmptyString {

	void printEmptyString() {
		String str = "";
		if (str.isEmpty()) {
			System.out.println("String is empty, no character found.");
		}
	}

	public static void main(String[] args) {
		new EmptyString().printEmptyString();
	}
}
