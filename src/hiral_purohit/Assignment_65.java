package hiral_purohit;
//"Remove digits and whitespace characters:

//input: H2i H3el4lo P4un2e5
//output: HiHelloPune"

public class Assignment_65 {
	void toRemoveDigitSpace(String str) {
		String temp = " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((!Character.isDigit(ch)) && !(ch == ' ')) {
				temp = temp + ch;
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		new Assignment_65().toRemoveDigitSpace("H2i H3el4lo P4un2e5");
	}

}
