package shravani_rapelli;

public class Assignment24 {
	
	void charFrequency(String input) {
		char ch;
		for(int index=0; index<input.length(); index++) {
			ch=input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment24 assign24 = new Assignment24();
		assign24.charFrequency("technocredits");
	}

}
