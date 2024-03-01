package suresh.array;

public class Assignment60 {
	
	int getCharFrequecy(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch1 = input.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	char getMinFrequecy(String input) {
		int maxcount = 0;
		char maxchar = ' ';

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = getCharFrequecy(input, ch);
			if (count > maxcount) {
				maxcount = count;
				maxchar = ch;

			}
		}return maxchar;
	}
	
	void getSecondMAx()
	{
		String input="aakanksha";
	
		char maxchar= getMinFrequecy(input);
		input=input.replace (Character.toString(maxchar),"");
		
		char maxchar1= getMinFrequecy(input);
		input=input.replace (Character.toString(maxchar),"");
		System.out.println(maxchar1);
		
	}
	
	public static void main(String[] args)
	{
		 Assignment60  assignment60 = new  Assignment60();
		 assignment60.getSecondMAx();
		 
	}
}
