package shridhar_k;

public class Assignment47 {
	
	void getDigitsFromString(String inpStr) {
		String output = "";
		for(int i= 0; i < inpStr.length(); i++) {
			if(Character.isDigit(inpStr.charAt(i))) {
				output = output + inpStr.charAt(i);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		String input = "Aas-H3v7i";
		new Assignment47().getDigitsFromString(input);
	}
}
