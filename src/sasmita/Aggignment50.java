package sasmita;

public class Aggignment50 {
	int getDigitCount(String str) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
				
			}
			
		}
		System.out.println("Total count of digits in a given String: "+count);
		return count;
		
	}
public static void main(String[] args) {
	String str ="H2i H3el4lo P4un2e5";
	new Aggignment50().getDigitCount(str);
}
}
