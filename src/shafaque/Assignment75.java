package shafaque;

public class Assignment75 {

	boolean checkIsDigit(String str) {
		Boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				flag = true;
			}

		}
		return flag;
	}

	void processData(String[] arr) {
		for (String name : arr) {
			Boolean flag = checkIsDigit(name);

			char ch = name.charAt(name.length() - 1);
			if (name.length() > 5 && (ch == 'a' || ch == 'A') && !flag)
				System.out.println(name);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		Assignment75 assignment75 = new Assignment75();
		assignment75.processData(arr);
	}

}
