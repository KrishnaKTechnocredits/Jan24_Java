package hiral_purohit;

public class Frequency {
	
	void printChar(String input, char targetChar) {
		int count =0;
		for (int i = 0; i < input.length() ; i++ ) {
			char ch = input.charAt(i);
			if( ch == targetChar)
				count++;
		}
		System.out.println(targetChar + " is comimg: " + count + " times");
	}
	
	public static void main(String[] args) {
		Frequency frequency  = new Frequency();
		frequency.printChar("technocredts", 't');
	}

}
