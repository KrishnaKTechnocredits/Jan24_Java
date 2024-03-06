/*
  String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}
 */

package suresh.array;

public class Assignment52 {

	int getDigitsfromString(String input) {
		String str = "0";
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (Character.isDigit(ch))
				str = str + ch;
		}
		if (str.isEmpty())
			return 0;
		else
			return Integer.parseInt(str);
	}

	void getTheString(String[] input) {
		int num[] = new int[input.length];
		System.out.print("{");
		for (int index = 0; index < input.length; index++) {
			num[index] = getDigitsfromString(input[index]);

			System.out.print(num[index] + " ");

		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		String[] arry = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		Assignment52 assignment52 = new Assignment52();

		assignment52.getTheString(arry);
	}

}
