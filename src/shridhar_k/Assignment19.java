//Print the frequency of the given character from the given String without case sensitivity (count lower + upper case), 
//please consider given character will be passed as lowercase.
package shridhar_k;

public class Assignment19 {
	void frequencyOfChar(String inputString, char character) {
		inputString = inputString.toLowerCase();
		int counter = 0;
		for (int index = 0; index < inputString.length(); index++) {
			if(inputString.charAt(index) == character) {
				counter++;
			}
		}
		System.out.println("frequency of " + character + " in technocredits is " + counter + ".");
	}
	
	public static void main(String[] arg) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.frequencyOfChar("technocrediTs teaches Technology.", 't');
	}

}
