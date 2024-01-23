package rohit_sutar;

public class Assignment17 {
/*
 * Print the frequency of the given character from the given String.
 * Input : technocredits
 * Char: t
 * Output : frequency of t in technocredits is 2.
 */
	void printFrequencyOfChar(String stringInput, char charInput) {
		int count = 0;
		for(int i =0; i < stringInput.length() ; i++) {
			char ch = stringInput.charAt(i);  	
			if(ch==charInput) {
				count++;
			}
		}
		System.out.println("Provided string is : "+stringInput);
		System.out.println("Character to check frequency : "+charInput);
		System.out.println("Frequncy of Character is "+count);
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printFrequencyOfChar("technocredit", 't');
	}
}
