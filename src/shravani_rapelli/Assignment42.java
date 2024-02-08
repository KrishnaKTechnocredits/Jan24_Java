package shravani_rapelli;

public class Assignment42 {
	
	boolean isDigitNumber(String str) {
		int count =0;
		for(int i=0; i<str.length(); i++) {
			boolean flag = Character.isDigit(str.charAt(i));
			if(flag == true) {
				count++;
			}
		}
		if(count>=2) {
			return true;
		}return false;
	}
	
	void printNames(String[] names) {
		for(int i=0; i<names.length; i++) {
			if(isDigitNumber(names[i]) == true) {
				System.out.println(names[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment42 assign42 = new Assignment42();
		String[] names = {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"};
		assign42.printNames(names);
	}

}
