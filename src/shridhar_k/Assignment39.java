
//Print all the names from given array having length more than 5 characters and should start with upper case.
package shridhar_k;

public class Assignment39 {
	
	boolean isStringMoreThan5(String inputStr) {
		if (inputStr.length() > 5)
			return true;
		else
			return false;
	}
	
	boolean isStartWithUpperCase(String inputStr) {
		char ch = inputStr.charAt(0);
		if (Character.isUpperCase(ch))
			return true;
		else
			return false;
	}
	
	void printStringStrWithUpperAndMoreThanFiveLength(String[] arr) {
		System.out.println("Output : ");
		for(int i =0; i<arr.length ; i++) {
			if(isStartWithUpperCase(arr[i]) && isStringMoreThan5(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"};
		new Assignment39().printStringStrWithUpperAndMoreThanFiveLength(arr);

	}

}
