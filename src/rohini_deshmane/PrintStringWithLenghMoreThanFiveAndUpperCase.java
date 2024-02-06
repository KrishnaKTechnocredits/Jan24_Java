package rohini_deshmane;
/*
 * Print all the names from given array having length more than 5 characters and should start with upper case.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"}
Output ; Aashvi
		 Sameer
		 Techno
 */
public class PrintStringWithLenghMoreThanFiveAndUpperCase {
	
	boolean isUpperCase(String str) {
		boolean flag = false;
		char ch = str.charAt(0);
		if(Character.isUpperCase(ch)) {
			flag =true;
		}
		return flag;
	}
	
	void printSringWithLenthGreater(String[] arr) {
		for(int index =0; index <arr.length; index++) {
			if(arr[index].length() >5) {
				boolean flag = isUpperCase(arr[index]);
				if(flag = true)
					System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		PrintStringWithLenghMoreThanFiveAndUpperCase printStr = new PrintStringWithLenghMoreThanFiveAndUpperCase();
		String[] arr = {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"};
		printStr.printSringWithLenthGreater(arr);
	}

}
