/*Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.

input : technocredits
output : tchncrdts*/

package madhura_kulkarni;

public class Assignment26 {

	void removevowels(String str2) {
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				String temp = str2.valueOf(ch);
				str2 = str2.replace(temp, "");
			}
		}
		System.out.println(str2);
	}

	public static void main(String[] args) {
		String str1 = "technocredits";
		Assignment26 ass = new Assignment26();
		ass.removevowels(str1);
	}

}
