package akshada_marne;

public class DetectEmptyString {

	void detect(String str) {

		if (str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}

	}

	public static void main(String args[]) {
		DetectEmptyString detectEmptyString = new DetectEmptyString();
		detectEmptyString.detect("");

	}
}
