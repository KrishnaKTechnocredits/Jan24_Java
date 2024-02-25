package technocredits.interview;

import java.util.Arrays;

public class PallindromCheck {

	public static void main(String[] args) {
		String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"};
		PallindromCheck pallindrom = new PallindromCheck();
		String[] output = pallindrom.passString(arr);
		System.out.println(Arrays.toString(output));
	}
	
	String[] passString(String[] input) {
		for(int i=0;i<input.length;i++) {
			input[i] = reverseString(input[i]);
		}
		return input;
	}
	
	String reverseString(String str1) {
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		if(!str1.equals(str2)) {
			char ch=str2.charAt(0);
			ch = Character.toUpperCase(ch);
			
			char ch1=str2.charAt(str2.length()-1);
			ch1 = Character.toUpperCase(ch1);
			
			str2 = ch + str2.substring(1,str2.length()-1) + ch1; 

		}
			
		return str2;
	}
    
}
