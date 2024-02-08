package rupali_umagol;

public class Assignment41 {
	void printDigitName(String[] names) {
		for(int i=0;i<names.length;i++) {
			String str=names[i].toLowerCase();
			if(str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o")|| str.startsWith("u")) {
				for(int index=0;index<str.length();index++) {
					boolean flag=Character.isDigit(str.charAt(index));
					if(flag==true) {
						System.out.println(str);
						break;	
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr={"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"};
		new Assignment41().printDigitName(arr);
	}
}
