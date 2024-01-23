package nisarg_patel;

public class Assignmetn18ReverseString {

	void printReverseString(String input) {
		for(int index = input.length()-1 ; index >= 0 ; index--) {
			System.out.println(input.charAt(index));
		}
	}
	public static void main(String[] args) {
		Assignmetn18ReverseString assignmetn18ReverseString = new Assignmetn18ReverseString();
		assignmetn18ReverseString.printReverseString("techno");
	}
}
