package gaurav_garg;

public class ReverseStringAsiisgnment18 {

	void reverseString(String reverse) {
		for (int i = reverse.length() - 1; i >= 0; i--) {
			System.out.println(reverse.charAt(i));
		}
	}

	public static void main(String[] args) {
		ReverseStringAsiisgnment18 reversestringasiisgnment18 = new ReverseStringAsiisgnment18();
		reversestringasiisgnment18.reverseString("techno");
	}
}
