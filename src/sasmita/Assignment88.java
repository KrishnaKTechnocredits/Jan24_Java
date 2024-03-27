package sasmita;

public class Assignment88 {
	
	String reverseWords(String str) {
		String str1="";
		for(int i=str.length()-1; i>=0;i--) {
			str1= str1+str.charAt(i);
			//System.out.println(str1);
		}
		return str1;
	}
	void reverseFirstandLastWord(String str) {
		String[] input = str.split(" ");
		String input1 = reverseWords(input[0]) + " ";
		for (int i = 1; i < input.length - 1; i++) {
			input1 += input[i] + " ";
		}
		input1 += reverseWords(input[input.length - 1]);
		System.out.println(input1);
	}

	public static void main(String[] args) {
		String str = "Welcome to the Technocredits";
		new Assignment88().reverseFirstandLastWord(str);
	

	}

}
