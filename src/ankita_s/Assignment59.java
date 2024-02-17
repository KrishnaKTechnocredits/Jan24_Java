package ankita_s;

public class Assignment59 {

	int Frequofchar(String str, char ch) {
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch == ch1)
				count++;
		}
		return count;
	}

	void display(String str) {
		int max = 0;
		char maxCh = ' ';
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int charcount = Frequofchar(str, ch);
			if (charcount > max) {
				max = charcount;
				maxCh = ch;
			}
		}
		System.out.println(maxCh + "->" + max);
	}

	public static void main(String[] args) {
		String str = "TeeCccChH";
		Assignment59 ass59 = new Assignment59();
		ass59.display(str);
	}
}
