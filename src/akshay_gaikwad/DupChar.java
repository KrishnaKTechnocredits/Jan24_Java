package akshay_gaikwad;

public class DupChar {
	void getDupChar(String input) {
		for (int index = 0 ; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				if(input.indexOf(ch) != input.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new DupChar().getDupChar("aakanksha");
	}
}
 