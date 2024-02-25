package rohit_sutar;

public class Assignment19 {

	void charFreq(String strInput, char providedChar) {
		strInput = strInput.toLowerCase();
		int count = 0;
		
		for(int i = 0 ; i<strInput.length() ; i++) {
			char ch = strInput.charAt(i);
			if(ch==providedChar) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.charFreq("technocrediTs teaches Technology",'t');
	}
}
