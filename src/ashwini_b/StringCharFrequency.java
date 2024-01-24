package ashwini_b;

/*
Print the frequency of the given character from the given String.
Input : technocredits
Char: t
Output : frequency of t in technocredits is 2.

 */
public class StringCharFrequency {

	void printCharFreq(String input){
		int count = 0;
		for(int index = 0 ; index <= input.length()-1; index++) {
			if(input.charAt(index) == 't') {
				count++;
			}
		}
		System.out.println("Output : frequency of t in " + input +  " is " + count);
	}
	public static void main(String[] args) {
		StringCharFrequency stringCharFrequency = new StringCharFrequency();
		stringCharFrequency.printCharFreq("technocredits");
		
	}

}
