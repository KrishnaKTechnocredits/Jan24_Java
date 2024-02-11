/*Assignment - 40 : 4th Feb'2024

Print all the names from given array which should start with consonant and ends with vowel.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
	 Techno
	 Garima */

package pallavi_raut;

class FindNameWithConsoEndVovel {

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		new FindNameWithConsoEndVovel().printNameWithConsoEndVovel(arr);
	}

	void printNameWithConsoEndVovel(String[] names) {
		for (int index = 0; index < names.length; index++) {
			String str = names[index].toLowerCase();
			if (!str.startsWith("a") && !str.startsWith("e") && !str.startsWith("i") && !str.startsWith("o")
					&& !str.startsWith("u")) {
				if (str.endsWith("a") || str.endsWith("e") || str.endsWith("i") || str.endsWith("o")
						|| str.endsWith("u")) {
					System.out.println(str);
				}
			}
		}
	}
}