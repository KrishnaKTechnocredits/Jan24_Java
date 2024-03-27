package gaurav_garg;

public class ProgramTwoSwipe2NumberAssignment93 {

	void swipeTwoNumbweWithThirdVariable(int a, int b) {
		System.out.println("Using Third Variable");
		System.out.println("Interger before Number Swipped -: " + a + " " + b);
		int c = 0;
		c = b;
		b = a;
		a = c;
		System.out.println("Interger After Number Swipped " + a + " " + b);
	}

	void swipeTwoNumbweWithoutThirdVariable(int a, int b) {
		System.out.println();
		System.out.println("Using Without Third Variable");
		System.out.println("Interger before Number Swipped -: " + a + " " + b);
		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println("Interger After Number Swipped " + a + " " + b);

	}

	void swipeTwStringWithThirdVariable(String a, String b) {
		System.out.println();
		System.out.println("Using Third Variable");
		System.out.println("String before Swipped -: " + a + " " + b);
		String c = null;
		c = b;
		b = a;
		a = c;
		System.out.println("String After Swipped-: " + a + " " + b);
	}

	void swipeTwStringWithoutThirdVariable(String a, String b) {
		System.out.println();
		System.out.println("Using Third Variable");
		System.out.println("String before Swipped -: " + a + " " + b);
		b = a + " " + b;
		a = b.split(" ")[1];
		b = b.split(" ")[0];
		System.out.println("String After Swipped-: " + a + " " + b);
	}

	public static void main(String[] args) {
		new ProgramTwoSwipe2NumberAssignment93().swipeTwoNumbweWithThirdVariable(60, 20);
		new ProgramTwoSwipe2NumberAssignment93().swipeTwoNumbweWithoutThirdVariable(60, 20);
		new ProgramTwoSwipe2NumberAssignment93().swipeTwStringWithThirdVariable("Gaurav", "Ram");
		new ProgramTwoSwipe2NumberAssignment93().swipeTwStringWithoutThirdVariable("Gaurav", "Ram");
	}
}
