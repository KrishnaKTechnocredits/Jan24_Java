package hiral_purohit;

public class Assignment_83 {

	void toGetCountOfDashInString(String str) {
		str = str + "a";
		int count = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				temp = temp + ch;
			} else if (!Character.isLetter(ch) && Character.isLetter(str.charAt(i + 1))) {
				count++;
				System.out.println(temp + "--->" + count);
				temp = "";
				count = 0;
			} else if (!Character.isLetter(ch)) {
				count++;
			}
		}
	}

	public static void main(String[] args) {
		String str = "I__am___in_pune____";
		new Assignment_83().toGetCountOfDashInString(str);
	}
}
