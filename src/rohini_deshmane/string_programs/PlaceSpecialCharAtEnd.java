package rohini_deshmane.string_programs;
/*
 * Assignment - 64: 16th Feb'2024
"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!"
 */

public class PlaceSpecialCharAtEnd {
	void specialCharAtEnd(String str) {
		String specialChar="";
		for(int i=0; i<str.length(); i++) {
			if(!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
				specialChar = specialChar + Character.toString(str.charAt(i));
				str = str.replace(Character.toString(str.charAt(i)), "");
			}
		}
		System.out.println(str+specialChar);
	}
	
	public static void main(String[] args) {
		PlaceSpecialCharAtEnd placeSpecialCharAtEnd = new PlaceSpecialCharAtEnd();
		placeSpecialCharAtEnd.specialCharAtEnd("-AasH?3v7i!");
	}

}
