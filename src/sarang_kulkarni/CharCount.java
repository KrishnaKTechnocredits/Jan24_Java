/*Assignment - 19 : 24th Jan'2024
Print the frequency of the given character from the given String without case sensitivity (count lower + upper case), please consider given character will be passed as lowercase.

Input : technocrediTs teaches Technology.
Char: t
Output : frequency of t in technocredits is 4.*/

package sarang_kulkarni;

public class CharCount {
	static int count=0;
	public static void main(String[] args) {
		CharCount CharCount = new CharCount();
		CharCount.charcount("technocrediTs teaches Technology",'t');
		System.out.println("frequecy of t in technocrediTs teaches Technology is "+count);
	}
	
	public void charcount(String name, char targetchar) {
		for(int i=0; i<name.length();i++) {
			String str=name.toLowerCase();
			char ch=str.charAt(i);
			if(ch==targetchar) {
				count++;
			}
		}
	}
}
