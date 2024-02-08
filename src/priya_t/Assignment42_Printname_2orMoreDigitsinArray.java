package priya_t;

public class Assignment42_Printname_2orMoreDigitsinArray {
	
	boolean isDigit(String name) {
		int count=0;
		for (int index = 0; index < name.length(); index++) {
			boolean flag = Character.isDigit(name.charAt(index));
			if (flag == true) {
				count++;
		}
	}
		if(count>=2) {
			return true;
		}return false;
	}
	
	
	void printallnames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isDigit(names[index]) == true ) {
				System.out.println(names[index]);
			}
		}

	}

	public static void main(String[] args) {
		String[] input={"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"};
		
		Assignment42_Printname_2orMoreDigitsinArray digit = new Assignment42_Printname_2orMoreDigitsinArray();
		digit.printallnames(input);
	}

}
