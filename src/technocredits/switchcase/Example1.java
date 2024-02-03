package technocredits.switchcase;

public class Example1 {

	public static void main(String[] args) {
//		int months = 13;
//		switch (months) {
//		case 1:
//			System.out.println("Jan");
//		case 2:
//			System.out.println("Feb");
//		case 3:
//			System.out.println("March");
//		default:
//			System.out.println("Invalid Month Index " + months);
//		case 5:
//			System.out.println("May");
//		case 6:
//			System.out.println("Jun");
//		case 4:
//			System.out.println("Apr");
//		}

//		String profile = "admin".toLowerCase();
//		switch(profile) {
//		case "admin":
//			System.out.println("Welcome Admin");
//			break;
//		case "User":
//			System.out.println("Welcome user");
//			break;
//		}

		char ch = getCharFromUser();
		switch (ch) {
		case 'A':
			System.out.println("A...");
			break;
		case 'H':
			System.out.println("H...");
		default:
			break;
		}
	}

	private static char getCharFromUser() {
		return 'A';
	}
}
