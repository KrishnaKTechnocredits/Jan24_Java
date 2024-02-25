package atisha;
// Print only characters occurring exactly twice
class Assignment55 {

	int getCountOfChar(String str, char ch) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i))
				count++;
       }
		
		return count;
	}
	void getTwiceChar(String input) {

		for (int index = 0; index < input.length(); index++) {
			int freq = getCountOfChar(input, input.charAt(index));
			char ch = input.charAt(index);
			if (freq == 2)
				if (input.indexOf(ch) == index)
					System.out.println(ch);
			
		}
	}

	public static void main(String[] args) {
		new Assignment55().getTwiceChar("teeccchhhnno");

	}
}
