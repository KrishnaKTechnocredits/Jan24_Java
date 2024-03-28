package dharma;

public class Assignment87 {

	String getReverseString(String word) {
		String output = "";
		for(int i = word.length()-1; i >= 0; i--) {
			output = output + word.charAt(i);
		}
		return output;
	}
	
	void printReverseString(String[] arr) {
		String output = "";
		for(int i = 0; i < arr.length; i++) {
			String output1 = getReverseString(arr[i]);
			output = output + output1 + " ";
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Assignment87 ass87 = new Assignment87();
		String str = "Welcome to Technocredits";
		String[] str1 = str.split(" ");
		ass87.printReverseString(str1);
	}
}
