package rupali_umagol;

class Assignment49{
	
	char[] getDigitFromArray(String[] arr) {
		char[] chr=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i].charAt(arr[i].length()-1);
			int len=arr[i].length();
			if(Character.isDigit(ch)) {
				chr[i]=arr[i].charAt(len-2);	
			}else {
				chr[i]=arr[i].charAt(len-1);
			}
		}
		return chr;
	}
	
	void displayCharArray(char[] chr) {
		for(int i=0;i<chr.length;i++) {
		System.out.println(chr[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment49 assignment49=new Assignment49();
		String input="techno credits32 pune4 indi5a";
		String[] arr=input.split(" ");
		char[] output=assignment49.getDigitFromArray(arr);
		assignment49.displayCharArray(output);
	}
}