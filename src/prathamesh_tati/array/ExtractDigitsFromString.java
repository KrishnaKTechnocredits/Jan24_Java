//Assignment - 47 : 4th Feb'2024
//Return the string extracting all the digits from it. 
//input :-Aas-H3v7i
//output:-37

package prathamesh_tati.array;

public class ExtractDigitsFromString {

	String getDigitsFromTheString(String input) {

		String output = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}
	
	void display(String input) {
		String output= getDigitsFromTheString(input);
		System.out.println(output);		//output in String
		System.out.println(Integer.parseInt(output));  //to get value in int
	}

	public static void main(String[] args) {
		ExtractDigitsFromString extractDigitsFromString = new ExtractDigitsFromString();
		String input = "Aas-H3v7i";
		extractDigitsFromString.display(input);
	}
}
