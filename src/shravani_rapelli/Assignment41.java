package shravani_rapelli;

public class Assignment41 {
	
	boolean startsWithVowel(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			return true;
		else
			return false;
	}
	
	boolean isDigit(String name) {
		for(int i=0; i<name.length(); i++) {
			boolean flag = Character.isDigit(name.charAt(i));
			if(flag==true)
				return true;
		}
		return false;
	}
	
	void printNames(String[] names) {
		for(int i=0; i<names.length; i++) {
			if(startsWithVowel(names[i])== true && isDigit(names[i])== true)
				System.out.println(names[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment41 assign41 = new Assignment41();
		String[] names = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"};
		assign41.printNames(names);
	}

}
