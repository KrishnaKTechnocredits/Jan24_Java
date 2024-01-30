package shravani_rapelli;

public class Assignment23 {

	void stringFreq(String input) {
		int count=0;
		char ch;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			count=0;
			for(int i=0; i<input.length(); i++) {
				if(ch == input.charAt(i)) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(ch);
			}

		}
	}
	
	public static void main(String[] args) {
		Assignment23 assign23 = new Assignment23();
		assign23.stringFreq("technocredits");
	}

}
