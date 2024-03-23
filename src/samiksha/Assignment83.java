package samiksha;

public class Assignment83 {

	void printCount(String str) {
		str = str + "s";
		int count = 0;
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				output = output + ch;
				count = 0;
			} else if (ch == '_' && Character.isLetter(str.charAt(index + 1))){
				count++;
				System.out.println(output + " > " + count);
				output = "";
			} else if (ch == '_') {
				count++;
			}
		}
	}

	public static void main(String[] args) {
		String str = "I__am___in_pune____";

		new Assignment83().printCount(str);
	}

}
