package ankita_s;

public class Assignment94 {
	void printReverseString(String str) {
		String output = " ";
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			output += arr[i] + " ";
		}
		System.out.println(output.trim());
	}

	public static void main(String[] args) {
		String str = "Kajol is Working in Roche";
		new Assignment94().printReverseString(str);
	}
}
