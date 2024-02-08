package ankita_s;

public class Assignment39Array {

	void m1(String[] str) {
		String ch = null;
		for (int i = 0; i < str.length; i++) {
			ch = str[i];
			char ch1 = ch.charAt(0);
			if (ch.length() > 5 && Character.isUpperCase(ch1)) {
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "techno" };
		Assignment39Array ass39 = new Assignment39Array();
		ass39.m1(arr);
	}
}
