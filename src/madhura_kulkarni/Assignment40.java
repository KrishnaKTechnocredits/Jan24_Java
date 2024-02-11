/*Assignment - 40 : 4th Feb'2024

Print all the names from given array which should start with consonant and ends with vowel.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
		 Techno
		 Garima*/

package madhura_kulkarni;

public class Assignment40 {
	void printNames(String[] str) {
		System.out.println("The names from given array which starts with consonant and ends with vowel are:");
		for(int i=0; i<str.length;i++) {
			 String input=str[i].toLowerCase();
			 if (!input.startsWith("a") && !input.startsWith("e")  && !input.startsWith("i") && !input.startsWith("o")  && !input.startsWith("u"))
					 { 
				 if (input.endsWith("a") || input.endsWith("e")  || input.endsWith("i") || input.endsWith("o")  || input.endsWith("u"))
			 {
				 System.out.println(str[i]);
			 }
			 }
		}
	}

	public static void main(String[] args) {
		String[] S = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		Assignment40 ass = new Assignment40();
		ass.printNames(S);

	}

}
