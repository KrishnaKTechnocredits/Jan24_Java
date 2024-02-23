/*
Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam
*/

package shridhar_k.Assignment67;

class Programe3 {

	String reverseStringAndProcess(String inpStr) {
		inpStr = inpStr.toLowerCase();
		String str = "";
		for (int i = inpStr.length() - 1; i >= 0; i--) {
			if (i == inpStr.length() - 1) {
				str += Character.toUpperCase(inpStr.charAt(i));
			} else
				str += inpStr.charAt(i);
		}
		return str;
	}

	String[] getProcessedStringArr(String inpStr) {
		String[] inpArr = inpStr.split(" ");
		for (int i = 0; i < inpArr.length; i++) {
			inpArr[i] = reverseStringAndProcess(inpArr[i]);
		}
		return inpArr;
	}

	void printOutput(String inpStr) {
		String[] inpArr = getProcessedStringArr(inpStr);
		for (int i = 0; i < inpArr.length; i++) {
			System.out.print(inpArr[i] + " ");
		}
	}

	public static void main(String[] arg) {
		String input = "Hi Hello Maulik";
		new Programe3().printOutput(input);
	}
}