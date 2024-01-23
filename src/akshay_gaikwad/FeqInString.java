package akshay_gaikwad;

public class FeqInString {
	void feqInString(String name, char ch) {
		int count = 0;
		for (int index = 0; index < name.length() ; index++) {
			if(name.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " +ch+ " in "+ name + " is " + count + ".");
	}
	
	public static void main(String[] args) {
		FeqInString feqinstring = new FeqInString();
		feqinstring.feqInString("technocredits", 't');
	}
}
