package hiral_purohit;
//"Replace digits with a specific character ('*'):

public class Assignment_66 {

	void toReplaceWithStar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				str = str.replace(ch, '*');
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new Assignment_66().toReplaceWithStar("H2i H3el4lo P4un2e5");
	}

}
