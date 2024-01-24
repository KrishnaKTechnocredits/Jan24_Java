package aanand;

public class Assignment19 {

	void frequencyOfChar(String str, char ch) {
		int count = 0 ;
		for(int index = 0; index < str.length(); index++) {
			String lower = str.toLowerCase();
			if(lower.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("frequency of t in technocredits is " + count);
	}
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.frequencyOfChar("technocrediTs teaches Technology", 't');
	}
}
