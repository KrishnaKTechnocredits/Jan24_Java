package priya_t;

public class UniqueCharWithoutStringOf {

	String a = "technocredits";

	private static void allunique(String a) {

		int[] count = new int[256];
        for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
            count[ch]++;
		}

		for (int i = 0; i < a.length(); i++) {
			char chh = a.charAt(i);

			if (count[chh] == 1) {
				System.out.println("index => " + i + " and unique character => " + a.charAt(i));
           }
		}
	}

	public static void main(String[] args) {

		UniqueCharWithoutStringOf uniquecharacter = new UniqueCharWithoutStringOf();
		String str = "technocredits";
		uniquecharacter.allunique(str);

	}
}