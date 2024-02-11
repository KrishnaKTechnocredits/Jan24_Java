/*Assignment - 39 : 4th Feb'2024
PhenolV_Assignment_45
Print all the names from given array which should start with consonant and ends with vowel.
input: {"Bashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
		 Techno
		 Garima*/

package phenol_verma;

public class ArrStrStartConEndVowl {
	void findStr(String arr[]) {

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index].toLowerCase();
			char frstChar = str.charAt(0);
			int strLenght = str.length();
			char lstChar = str.charAt(strLenght - 1);

			if (frstChar != 'a' && frstChar != 'e' && frstChar != 'i' && frstChar != 'o' && frstChar != 'u') {
				if (lstChar == 'a' || lstChar == 'e' || lstChar == 'i' || lstChar == 'o' || lstChar == 'u') {
					System.out.println(arr[index]);
				}

			}
		}
	}

	public static void main(String[] args) {
		ArrStrStartConEndVowl arrStrStartConEndVowl = new ArrStrStartConEndVowl();
		String arr[] = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		arrStrStartConEndVowl.findStr(arr);
	}
}
