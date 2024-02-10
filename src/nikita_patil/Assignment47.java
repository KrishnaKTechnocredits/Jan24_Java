package nikita_patil;

public class Assignment47 {
	public static void main(String[] args) {
		String S = "-Aas-H3v7i";
		new Assignment47().printString(S);

	}

	void printString(String str) {
		System.out.println("Input string is: " + str);
        String answer = "";
		System.out.println("Output string after extracting digits from it:");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) == true)
				answer = answer + ch;

		}
		System.out.println(answer);
	}
}


