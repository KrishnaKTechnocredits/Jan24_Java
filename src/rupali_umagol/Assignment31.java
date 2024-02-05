package rupali_umagol;

public class Assignment31 {
	int countCharFromString(String input, char value) {
		int count=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch==value)
				count++;
		}
		return count;
	}
	void printChar(String input) {
		int max=0;
		char ch1=' ';
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
		int value=countCharFromString(input,ch);
		if(max<value) {
			max=value;
			ch1=ch;
			}
		}
		if(max==1) {
			System.out.println(input+" having all unique characters");
		}else 
		System.out.println(ch1 +" ->"+max);
	}
	
	public static void main(String[] args) {
		Assignment31 assignment31=new Assignment31();
		assignment31.printChar("aakanksha");
		assignment31.printChar("teecccchnoceredites");
		assignment31.printChar("maulik");
	}
}