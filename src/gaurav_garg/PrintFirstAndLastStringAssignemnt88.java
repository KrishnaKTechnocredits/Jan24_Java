package gaurav_garg;

public class PrintFirstAndLastStringAssignemnt88 {

	String reverseEachWord(String str) {
		String new1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			new1 = new1 + c;
		}
		return new1;
	}

	void printReverseString(String s) {
		String arr[] = s.split(" ");
		String newLine = "";
		String name = reverseEachWord(arr[0]);
		String Last = reverseEachWord(arr[arr.length - 1]);
		for (int i = 1; i < arr.length - 1; i++) {
			newLine = newLine + arr[i] + " ";
		}
		System.out.print(name + " " + newLine + Last);
	}

	public static void main(String[] args) {
		String str = "Welcome to the Technocredits";
		new PrintFirstAndLastStringAssignemnt88().printReverseString(str);
	}
}
