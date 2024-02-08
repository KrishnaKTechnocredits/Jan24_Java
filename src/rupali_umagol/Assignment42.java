package rupali_umagol;

public class Assignment42 {
	void printDigitName(String[] names) {
		int count=0;
		for(int i=0;i<names.length;i++) {
			String str=names[i].toLowerCase();
			if(str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o")|| str.startsWith("u")) {
				for(int index=0;index<str.length();index++) {
					boolean flag=Character.isDigit(str.charAt(index));
					if(flag==true) {
						count++;
					}
				}
				if(count>2)
					System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr={"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sh4a"};
		new Assignment42().printDigitName(arr);
	}
}