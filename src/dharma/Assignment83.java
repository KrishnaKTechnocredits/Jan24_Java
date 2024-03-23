package dharma;

public class Assignment83 {

	void countUnderscore(String str) {
		str = str + "A";
		int count = 0;
		String Word = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				Word = Word + ch + "";
			}else if(ch == '_' && (Character.isAlphabetic(str.charAt(i + 1)))) {
				count++;
				System.out.println(Word + "->" + count);
				Word = "";
				count = 0;
			}else if(ch == '_') {
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "I__am___in_Pune____";
		Assignment83 ass83 = new Assignment83();
		ass83.countUnderscore(str);
	}
}
