package suresh.array;

public class RemoveTheDigitsFormStinng {

	void GetCharWithoutIntiger(String input) {
		String str = " ";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveTheDigitsFormStinng removeTheDigitsFormStinng = new RemoveTheDigitsFormStinng();
		removeTheDigitsFormStinng.GetCharWithoutIntiger("H2i H3el4lo P4un2e5");
	}

}
