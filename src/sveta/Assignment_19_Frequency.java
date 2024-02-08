/*Assignment - 19 : 24th Jan'2024
Print the frequency of the given character from the given String without case sensitivity (count lower + upper case), please consider given character will be passed as lowercase.

Input : technocrediTs teaches Technology.
Char: t
Output : frequency of t in technocredits is 4. */
package sveta;

public class Assignment_19_Frequency {

	public void frequency(String str, char c) {
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(c==str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of "+ c + " is "+count);
	}
	public static void main(String[] args) {
		Assignment_19_Frequency freq = new Assignment_19_Frequency();
		freq.frequency("technocrediTs teaches Technology", 't');
	}

}
