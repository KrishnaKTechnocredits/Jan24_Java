package hiral_purohit;

public class Assignment_67 {

	String reverseString(String str) {
		String temp = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			temp = temp + ch;
		}
		return temp;
	}

	void toPrintReverseString(String[] str) {
		String output = "";
		for (int i = 0; i < str.length; i++) {
			String temp = reverseString(str[i]);
			output = output + temp + " ";
		}
		System.out.println(output.trim());
	}

	public static void main(String[] args) {
		Assignment_67 assignment_67 = new Assignment_67();
		String str = "Hi Hello Maulik";
		String arr[] = str.split(" ");
		System.out.println("output of Program1: ");
		assignment_67.toPrintReverseString(arr);
	}

}
