package shraddha;

public class Assignment69 {
	
	int getMaxWordLength(String str) {
		int maxLength = 0;
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++) {
			if(str1[i].length() > maxLength) 
				maxLength=str1[i].length();
		}
		return maxLength;
	}
	
	void printPattern(String str) {
		int maxWord = 0;
		maxWord = getMaxWordLength(str);
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++) {
			if(str1[i].length()<=maxWord) {
				for(int j=0;j<maxWord-str1[i].length();j++) {
					System.out.print(" ");
				}
				System.out.print(str1[i]);
			}		
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment69 ass69 = new Assignment69();
		ass69.printPattern("Hello Hi TechnoCredits Pune");
	}

}
