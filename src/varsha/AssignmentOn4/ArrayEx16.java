package varsha.AssignmentOn4;

//Assignment - 46 : 4th Feb'2024
//Return the string extracting all the digits from it. 
//input :-Aas-H3v7i
//output:- 37

public class ArrayEx16 {

	void printString(String input) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new ArrayEx16().printString("Aas-H3v7i");
	}
}
