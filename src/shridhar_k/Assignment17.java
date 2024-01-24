//Print the frequency of the given character from the given String.

package shridhar_k;

public class Assignment17 {
	void charFrequency(String inpuutString, char character){
		int count = 0;
		for (int index=0; index<inpuutString.length(); index++){
			if(inpuutString.charAt(index)== character){
				count++;
			}
		}
		System.out.println("frequency of " + character + " in " + inpuutString + " is " + count +".");
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.charFrequency("technocredits",'t');
	}
}
