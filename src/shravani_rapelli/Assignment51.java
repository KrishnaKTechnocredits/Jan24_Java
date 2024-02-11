package shravani_rapelli;

public class Assignment51 {
	
	void removeAllDigitsFromString(String str) {
		String result ="";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch)) {
				result = result + ch;
			}
		}
		System.out.println("output : " + result);
	}
	
	public static void main(String[] args) {
		Assignment51 assign51 = new Assignment51();
		assign51.removeAllDigitsFromString("H2i H3el4lo P4un2e5");
	}
}
