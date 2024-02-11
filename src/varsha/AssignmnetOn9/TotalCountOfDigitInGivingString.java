package varsha.AssignmnetOn9;

//WAP to find count of digits in a given String.
//String str = "H2i H3el4lo P4un2e5";
//output : 6

public class TotalCountOfDigitInGivingString {

	int getCountOfDigit(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		int count = new TotalCountOfDigitInGivingString().getCountOfDigit(input);
		System.out.println(count);
	}
}
