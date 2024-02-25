/*
 * PRogram 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You
 */
package shridhar_k.Assignment67;

import java.util.Arrays;

class Program2 {

	void processString(String inpStr) {
		String output = "";
		inpStr = inpStr.toLowerCase();
		String[] inpArr = inpStr.split(" ");
		for (int i = 0; i < inpArr.length; i++) {
			String inpStr1 = inpArr[i];
			inpArr[i] = inpStr1.replaceFirst(String.valueOf(inpStr1.charAt(0)),
					String.valueOf(Character.toUpperCase(inpStr1.charAt(0))));
		}
		output = Arrays.toString(inpArr);
		output = output.replace(String.valueOf('['), "").replace(String.valueOf(']'), "").replace(String.valueOf(','),
				"");
		System.out.println(output);

	}

	public static void main(String[] arg) {
		String str = "hi hEllO how are you";
		new Program2().processString(str);
	}
}