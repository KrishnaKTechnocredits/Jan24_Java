package samiksha;

public class CapitalCharacter {

	void removeCapitalCh() {
		String str = "TechNoCREdits";
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
				String temp = String.valueOf(ch);
				str = str.replace(temp, "*");
			}
		}
		String input = str.replace("*", "");
		System.out.print(input);
	}

	public static void main(String[] args) {
		new CapitalCharacter().removeCapitalCh();
	}

}
