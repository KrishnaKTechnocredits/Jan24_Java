
/*
 Assignment - 56 : "Print only unique vowels:
input: technocredits
output: eo"
"Print only unique vowels:
input: technocredits
output: oi"
 */
  package suresh.array;
 

public class Assignment56 {

	void getFreqOfChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {

				if (ch1 == 'o' || ch1 == 'e' || ch1 == 'i' || ch1 == 'a' || ch1 == 'u')

					System.out.print(ch1);

			}

		}

	}

	public static void main(String[] args) {
		Assignment56 assignment56 = new Assignment56();

		assignment56.getFreqOfChar("technocredits");
	}

}