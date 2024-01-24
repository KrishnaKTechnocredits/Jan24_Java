package rohit_sutar;

/*
 * Print character of given String in reverse order.
 */

public class Assignment18 {

	void printReverseString(String inputString) {
		System.out.println("Entered String is : "+inputString);
		int length = inputString.length()-1;
		System.out.println("Length of entered string is : "+length);
		System.out.println("Given String in Reverse Order : ");
		for(int i = length ; i > 0 ; i--){
			char ch = inputString.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.printReverseString("Techno");
	}
}
