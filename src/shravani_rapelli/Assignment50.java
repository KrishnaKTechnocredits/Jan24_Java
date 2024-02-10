package shravani_rapelli;

public class Assignment50 {
	
	void printCountOfDigitsInString(String input) {
		int count=0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Assignment50 assign50 = new Assignment50();
		assign50.printCountOfDigitsInString("H2i H3el4lo P4un2e5");
	}

}
