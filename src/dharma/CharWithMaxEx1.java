package dharma;

public class CharWithMaxEx1 {

	int getCharFreq(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == c) {
				count++;
			}
		}
		return count;
	}
	
	void printCharFreq(String input) {
		int max = 0;
		char targetch = ' ';
		
		for(int i = 0; i < input.length(); i++) {
			input = input.toLowerCase();
			char ch = input.charAt(i);
			int count = getCharFreq(input, ch);
			
			if(max < count) {
				max = count;
				targetch = ch;
			}
		}
			System.out.println(targetch + "->" + max);
	}
	
	public static void main(String[] args) {
		CharWithMaxEx1 charwithmaxex1 = new CharWithMaxEx1();
		charwithmaxex1.printCharFreq("TeeCccChH");

	}

}
