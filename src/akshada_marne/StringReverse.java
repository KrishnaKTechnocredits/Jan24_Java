package akshada_marne;

public class StringReverse {

	void reverse(String input) {
		for(int index=input.length()-1; index>=0; index--) {
		char ch=input.charAt(index);
		System.out.println(ch);
		}		
	}
	
	public static void main(String args[]) {
		StringReverse stringReverse = new StringReverse();
		stringReverse.reverse("techno");
	}
}
