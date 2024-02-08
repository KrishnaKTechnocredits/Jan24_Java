package priya_t;

public class Assignment39_PrintNameCharMorethan5inArray {

	public void ArrayFreq(String[] names) {

		for (int index = 0; index <= names.length - 1; index++) {
			if (names[index].length() > 5) {
				Character.isUpperCase(names[index].charAt(0));  
				System.out.println("Print Name of given Array having length more than 5 character is :" + names[index]);
			}
		}
    }

	public static void main(String[] args) {
		String[] names = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		Assignment39_PrintNameCharMorethan5inArray arrayfrequency = new Assignment39_PrintNameCharMorethan5inArray();
		arrayfrequency.ArrayFreq(names);
	}
}
