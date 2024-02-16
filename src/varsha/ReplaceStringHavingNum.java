package varsha;

//Replace digits with a specific character ('*'):
//	input: H2i H3el4lo P4un2e5
//	output: H*i H*el*lo P*un*e*

public class ReplaceStringHavingNum {

	String getString(String input) {
		char ch = ' ';
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (Character.isDigit(ch))
				input = input.replace(ch, '*');
		}
		return input;
	}

	public static void main(String[] args) {
		String output = new ReplaceStringHavingNum().getString("H2i H3el4lo P4un2e5");
		System.out.println(output);
	}

}
