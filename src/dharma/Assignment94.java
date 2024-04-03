package dharma;

public class Assignment94 {

	void reverseString(String str) {
		String[] str1 = str.split(" ");
		String output = "";
		for (int i = str1.length - 1; i >= 0; i--) {
			output = output + str1[i] + " ";
		}
		output = output.trim();
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment94 ass94 = new Assignment94();
		String str = "Kajol is Working in Roche";
		ass94.reverseString(str);
	}
}
