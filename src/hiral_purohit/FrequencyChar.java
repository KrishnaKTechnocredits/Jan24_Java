package hiral_purohit;

public class FrequencyChar {
	int count;

	void printUniqueChar(String str) {
		int count;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			count = 0;
				for(int index=0; index< str.length(); index++) {
					if(ch == str.charAt(index)) {
						count++;
					}
				}
				if(count==1) {
					System.out.print(ch);
				}
		}	
	}
	
	public static void main(String[] args) {
		FrequencyChar frequencyChar = new FrequencyChar();
		frequencyChar.printUniqueChar("technocredits");
	}
}
