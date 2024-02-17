package shramika_vaidya;

public class DetectEmptyInputString {
	void isEmptyString(String str) {
		if (str.isEmpty())
			System.out.println("Empty string ,no character found");
		else
			System.out.println(str);
	}

	public static void main(String[] args) {
		new DetectEmptyInputString().isEmptyString("");
	}
}
