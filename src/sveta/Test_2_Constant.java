package sveta;
public class Test_2_Constant {

	void getUniqueChar(String input) {
		char c=' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (getCountOfChar(input, ch) == 1) 
				c=ch;	
		}
		System.out.println(c);
	}
	
	int getCountOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch) 
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Test_2_Constant test = new Test_2_Constant();
		test.getUniqueChar("technocredits");

	}

}
