package technocredits;

public class StringEx1 {
	
	void printAllChar(String input, char targetChar) {
		int count =0;
		for(int index=0;index<input.length();index++) {			
			char ch = input.charAt(index);
			if(ch == targetChar)
				count++;
		}
		System.out.println(targetChar + "->" + count);
	}
	
	public static void main(String[] args) {
		StringEx1 stringEx1 = new StringEx1();
		stringEx1.printAllChar("techno", 't');
	}
}