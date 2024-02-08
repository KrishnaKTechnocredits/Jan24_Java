package technocredits;

public class CharacterEx2 {

	public static void main(String[] args) {
		String str = "tecooohnoceeaaaareditsuuuiii";
		str = str.replace("a", "")
				.replace("e","")
				.replace("i", "")
				.replace("o", "")
				.replace("u", "");
		
		System.out.println(str);
	}
}
