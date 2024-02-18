package varsha;

//Create required methods to complete below 3 programs.
//Its on you how many java classes you want to write, all methods in same class is also ok.
//
//Program 1: 
//input : Hi Hello Maulik
//output : iH olleH kiluaM
//
//PRogram 2: 
//String str = "hi hEllO how are you";
//output : Hi Hello How Are You
//
//Program 3: 
//input : Hi Hello Maulik
//output : Ih Olleh Kiluam

public class StringManupulation {

	String getReverseString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			str = str + input.charAt(i);
		}
		return str;
	}

	String getFirstLetterOfWordCapital(String input) {
		String output = "";
		output = output + Character.toUpperCase(input.charAt(0));
		for (int i = 1; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				output = output + " " + Character.toUpperCase(input.charAt(i + 1));
				i++;
			} else {
				output = output + Character.toLowerCase(ch);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input1 = "Hi Hello Maulik";
		String input2 = "hi hellO how are you";
		String[] arr = input1.split(" ");

		// First Program
		String output = input1;
		StringManupulation stringManupulation = new StringManupulation();
		for (int index = 0; index < arr.length; index++) {
			output = output.replace(arr[index], stringManupulation.getReverseString(arr[index]));
		}
		System.out.println("output1 : " + output);

		// Second Program
		String output2 = stringManupulation.getFirstLetterOfWordCapital(input2);
		System.out.println("output2 : " + output2);

		// Third Program
		String input3 = output;
		String output3 = stringManupulation.getFirstLetterOfWordCapital(input3);
		System.out.println("output3 : " + output3);

	}
}