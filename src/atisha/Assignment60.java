//print character with second highest frequency of given string
package atisha;

public class Assignment60 {

	int getCharfreq(String str, char ch) {
		int count=0;
		String str1 = str.toLowerCase();
		for(int i=0; i<str1.length();i++) {
			char ch1 =str1.charAt(i);
			if (ch1 == ch) {
				count++;
			}
			
		}
		
		return count;
		}
	
	  char maxCharFreq(String str) {
		int count = 0;
		int countm=0;
		char chr= '_';
		String nstr = str.toLowerCase();
		for(int i=0;i<nstr.length();i++) {
			
			char ch2=nstr.charAt(i);
			if (ch2==nstr.charAt(i) ) {
				count = getCharfreq(str, str.charAt(i));
			
			
			if (count>countm) {
				countm=count;
				chr = ch2;
				
			}
		}
	}
		
		return chr;
		
	}
	  void secondMaxfreq(String str) {
		char chr = maxCharFreq(str);
		str= str.replace(Character.toString(chr),"");
		chr = maxCharFreq(str);
		System.out.println("character with second highest frequency  "+chr + "="+getCharfreq(str , chr));
		
	}
	   public static void main(String[] args) {
		new Assignment60().secondMaxfreq("aakanksha");
	}
		
}
