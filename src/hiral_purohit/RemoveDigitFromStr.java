package hiral_purohit;

public class RemoveDigitFromStr {
	
	String toRemoveDigit(String input) {
		String str ="";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(!Character.isDigit(ch)) {
				str= str + ch;
			}	
		}System.out.println(str);
		return input;
	}
	
	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new RemoveDigitFromStr().toRemoveDigit(str);
	}

}
