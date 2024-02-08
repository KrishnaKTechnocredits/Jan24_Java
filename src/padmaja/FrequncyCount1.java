/*Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis*/


package padmaja;

public class FrequncyCount1 {
	void charCount(String str) {
		for (int index = 0; index < str.length(); index++) {
			int count = 0;
			char ch = str.charAt(index);
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch)
					count++;
			}

			if (count == 1)
				System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		FrequncyCount1 count = new FrequncyCount1();
		count.charCount("technocredits");
	}
}
