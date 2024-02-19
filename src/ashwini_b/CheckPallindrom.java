package ashwini_b;

import java.util.Arrays;

/*
 Reverse the name with first and last character as uppercase if name is not a pallindrom. 
 if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
 */
public class CheckPallindrom {

	String[] chekPallindname(String[] inputarry) {
		String[] newOutputarry = new String[inputarry.length];

		for (int i = 0; i < inputarry.length; i++) {
			String str = inputarry[i];
			String reversestr2 = "";
			for (int j = str.length() - 1; j >= 0; j--) {
				char ch = str.charAt(j);
				reversestr2 = reversestr2 + ch;
			}
			if (!str.equalsIgnoreCase(reversestr2)) {
				char ch1 = str.toUpperCase().charAt(0);
				char ch2 = str.toUpperCase().charAt(str.length() - 1);
				reversestr2 = ch2 + reversestr2.substring(1, reversestr2.length() - 2) + ch1;
			}
			newOutputarry[i] = reversestr2;
		}
		//System.out.println(Arrays.toString(newOutputarry));
		return (newOutputarry);
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		CheckPallindrom checkPallindrom = new CheckPallindrom();
		String[] outputstr = checkPallindrom.chekPallindname(arr);
		System.out.println(Arrays.toString(outputstr));
	}

}
