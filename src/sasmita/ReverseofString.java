package sasmita;

public class ReverseofString {
	
	void reveseString(String input) {
		for(int index=input.length()-1; index>=0; index--){
			System.out.println(input.charAt(index));
		}
	}
	public static void main(String[]args) {
		ReverseofString rev = new ReverseofString();
		rev.reveseString("techno");
	}
}