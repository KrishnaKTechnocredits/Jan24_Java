package akshay_gaikwad;

public class ReverseString {
	void reverseString(String name) {
		for (int index = (name.length() - 1) ; index >=0 ; index--) {
			System.out.println(name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		ReverseString reversestr = new ReverseString();
		reversestr.reverseString("techno");
	}
}