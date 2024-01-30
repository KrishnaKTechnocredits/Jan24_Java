package puja_poreddiwar;

public class GetStringChar1 {

	void GetCharFreq(String str) {
		char ch; 
		for(int i=0; i <str.length(); i++) {
			ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] agrs) {
		GetStringChar getChar = new GetStringChar();
		getChar.GetCharFreq("technocredits");
	}
}
