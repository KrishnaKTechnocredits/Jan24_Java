package dharma;

public class Char_num {

	void printAllChar(String input) {
		int index =0;

		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if(c=='t') {
				index++;
			}
		}
		System.out.println("frequency of t in technocredits " +index);
	}
	
	public static void main(String[] args) {
		Char_num cn = new Char_num();
		cn.printAllChar("technocredits");
	}

}
