package dharma;

public class ConstEx1 {

	public void freq(String str) {
		str=str.toLowerCase();
		char c = ' ';
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}	
		}
	}	
	public static void main(String[] args) {
		ConstEx1 ce1 = new ConstEx1();
		ce1.freq("aakansha");
	}
}
