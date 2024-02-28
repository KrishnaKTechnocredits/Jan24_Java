package akshada_marne;

public class LenGreaterThan5UpperCaseStart {

	void findString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 5 && Character.isUpperCase(arr[i].charAt(0))) {
				System.out.println(arr[i]);
			}
		}

	}

	public static void main(String args[]) {
		LenGreaterThan5UpperCaseStart lenGreaterThan5UpperCaseStart = new LenGreaterThan5UpperCaseStart();
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "harsh", "phenol" };
		lenGreaterThan5UpperCaseStart.findString(arr);
	}
}
