package nikita_patil;
import java.util.Arrays;

public class Assignment88 {
	String toGetReverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			temp = temp + ch;
		}
		return temp;
	}

	String toGetOutputString(String str) {
		String[] arr = str.split(" ");
		String output = "";
		for (int i = 0; i < arr.length - 1; i++) {
			arr[0] = toGetReverseString(arr[i]);
			output = output + " " + arr[i];
		}
		arr[arr.length - 1] = toGetReverseString(arr[arr.length - 1]);
		output = output + " " + arr[arr.length - 1];
		return output.trim();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to the Technocredits";
		System.out.println(new Assignment88().toGetOutputString(str));
	}
}
