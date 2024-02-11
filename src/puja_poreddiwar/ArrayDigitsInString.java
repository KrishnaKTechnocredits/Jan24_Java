/* Assignment - 50 : 9th Feb'2024
  	WAP to find count of digits in a given String.
   	String str = "H2i H3el4lo P4un2e5";
    output : 6*/

package puja_poreddiwar;

public class ArrayDigitsInString {

	int count = 0;

	void getCountOfDigits(String arr) {
		for (int index = 0; index < arr.length(); index++) {
			char ch = arr.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		ArrayDigitsInString AR1 = new ArrayDigitsInString();
		AR1.getCountOfDigits(str);

	}

}
