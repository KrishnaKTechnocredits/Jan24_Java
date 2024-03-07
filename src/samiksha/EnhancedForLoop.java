package samiksha;

public class EnhancedForLoop {

	boolean isArrayContainsDigit(String str) {
		boolean flag=false; ;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
			}
		}
		return flag;

	}

	void processData(String[] str) {
		for (String name : str) {
			char lastChar = name.charAt(name.length() - 1);
			boolean flag = isArrayContainsDigit(name);
			if (name.length() > 5 && (lastChar == 'a' || lastChar == 'A') && flag != true) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new EnhancedForLoop().processData(names);
	}

}
