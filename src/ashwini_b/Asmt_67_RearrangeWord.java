package ashwini_b;

/*
Assignment - 67 : 17th Feb'2024
Create required methods to complete below 3 programs.
Its on you how many java classes you want to write, all methods in same class is also ok.

 Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM

PRogram 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You

Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam
 */
public class Asmt_67_RearrangeWord {

	void progrm1(String[] inputarry) {
		String returnString = "";
		for (int i = 0; i < inputarry.length; i++) {
			String str = inputarry[i];
			String reversestr = "";
			for (int j = str.length() - 1; j >= 0; j--) {
				char ch = str.charAt(j);
				reversestr = reversestr + ch;
			}
			// System.out.println(reversestr);
			returnString = returnString + reversestr + " ";
		}
		System.out.println(returnString);
	}

	void program2(String[] inputarry2) {
		String returnString2 = "";
		for (int i = 0; i < inputarry2.length; i++) {
			String str2 = inputarry2[i];
			String hightolowercase = "";
			str2 = str2.toLowerCase();
			char ch = str2.charAt(0);
			char upperch = Character.toUpperCase(ch);
			hightolowercase = upperch + str2.substring(1, str2.length());
			// System.out.println(hightolowercase);
			returnString2 = returnString2 + hightolowercase + " ";
		}
		System.out.println(returnString2);
	}

	void program3(String[] inputarr3) {
		String returnString3 = "";
		for (int i = 0; i < inputarr3.length; i++) {
			String str3 = inputarr3[i];
			String reversString = "";
			str3 = str3.toLowerCase();
			for (int j = str3.length() - 1; j >= 0; j--) {
				reversString = reversString + str3.charAt(j);
			}
			char ch = reversString.charAt(0);
			ch = Character.toUpperCase(ch);
			reversString = ch + reversString.substring(1, reversString.length());
			returnString3 = returnString3 + reversString + " ";

		}
		System.out.println(returnString3);

	}

	public static void main(String[] args) {
		String str = "Hi Hello Maulik";
		String[] newArr = str.split(" ");
		Asmt_67_RearrangeWord asmt_67_RearrangeWord = new Asmt_67_RearrangeWord();
		asmt_67_RearrangeWord.progrm1(newArr);

		String str2 = "hi hEllO how are you";
		String[] newArr2 = str2.split(" ");
		asmt_67_RearrangeWord.program2(newArr2);

		String str3 = "Hi Hello Maulik";
		String[] newArr3 = str3.split(" ");
		asmt_67_RearrangeWord.program3(newArr3);

	}
}
