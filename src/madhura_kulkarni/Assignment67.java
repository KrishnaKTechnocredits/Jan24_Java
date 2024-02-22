/*Assignment - 67 : 17th Feb'2024
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
output : Ih Olleh Kiluam*/
package madhura_kulkarni;

public class Assignment67 {
	String reverse(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output = output + str.charAt(i);
		}
		return output;
	}

	void printData(String[] str1) {
		String finalstr = "";
		for (int i = 0; i < str1.length; i++) {
			finalstr = finalstr + reverse(str1[i]) + " ";
		}
		System.out.println("Output string : " + finalstr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Maulik";
		System.out.println("Input string : " + input);
		String[] str1 = input.split(" ");
		new Assignment67().printData(str1);
	}

}
