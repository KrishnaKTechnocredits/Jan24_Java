package akshay_gaikwad;

public class CapitalFirstLetterInString {
	
	void capitalFirstLetterInWholeString(String str) {
		str = str.trim();
		String[] strArr = str.split(" ");
		String output = "";
		for (int index = 0; index < strArr.length; index++) {
			output += capitalFirstLetterInString(strArr[index]);
		}
		System.out.println("Output : " + output);
	}

	String capitalFirstLetterInString(String str) {
		String output = "";
		output += Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase() + " ";
		return output;
	}

	public static void main(String[] args) {
		String str = "hi hEllO how are you";
		System.out.println("Input : " + str);
		new CapitalFirstLetterInString().capitalFirstLetterInWholeString("hi hEllO how are you");
	}
}
