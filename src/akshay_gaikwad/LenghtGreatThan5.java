package akshay_gaikwad;

public class LenghtGreatThan5 {
	void printStringGreatThan5(String [] arr) {
		for (int index = 0; index < arr.length; index++){
			char ch = arr[index].charAt(0);
			if ((arr[index].length() > 5) && Character.isUpperCase(ch)) {
				System.out.println(arr[index]);
				}
			}
		}
	public static void main(String[] args) {
		String[] arr = {"Aashvi","aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"};
		new LenghtGreatThan5().printStringGreatThan5(arr);
	}
}
