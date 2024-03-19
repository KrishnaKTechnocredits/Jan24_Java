/*Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam*/

package pallavi_raut;

//Assignment 67 part -3
public class ReverceStringAndFirstLetterCapital_67_3 {

	public static void main(String[] args) {
		String str = "Hi Hello Maulik";
		System.out.println("Input String : " + str);
		String[] arr = str.split(" ");
		new ReverceStringAndFirstLetterCapital_67_3().setFirstLetterCapital(arr);
	}

	String[] setFirstLetterCapital(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String temp = getReverceString(input[i]);
			for (int j = 0; j < temp.length(); j++) {
				char ch = temp.charAt(0);
				String str1 = String.valueOf(ch);
				temp = temp.replaceFirst(str1, str1.toUpperCase());
			}
			output[i] = temp;
			System.out.print(output[i] + " ");
		}
		return output;
	}

	String getReverceString(String str) {
		String str1 = "";
		str = str.toLowerCase();
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		return str1;
	}

}