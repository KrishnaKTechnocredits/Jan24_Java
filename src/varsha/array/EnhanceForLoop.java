package varsha.array;

//Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
//String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
//
//output : Samiksha 
public class EnhanceForLoop {

	boolean checkstringhaveDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				return true;
		}
		return false;
	}

	void processData(String[] arr) {
		for (String str : arr) {
			char lastChar = str.charAt(str.length() - 1);
			boolean flag = checkstringhaveDigit(str);
			if (str.length() > 5 && (lastChar == 'a' || lastChar == 'A') && flag == false)
				System.out.println(str);
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new EnhanceForLoop().processData(names);
	}

}
