package sveta;

public class Assignment_40 {

	public boolean isConsonent(String str) {
		boolean flag=false;
		str=str.toLowerCase();
		char ch =str.charAt(0);
		
		if(ch != 'a' && ch != 'e'&& ch != 'i'&& ch != 'o' && ch != 'u') 
			flag=true;
		else
			flag =false;
		
		return flag;
	}
	
	public boolean isVowel(String str) {
		boolean flag=false;
		str = str.toLowerCase();
		char ch =str.charAt(str.length()-1);
		if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u') 
			flag=true;
		else
			flag =false;
		
		return flag;
	}
	public void PrintString(String []arr) {
		for(int i=0;i<arr.length;i++) {
			if(isConsonent(arr[i])==true && isVowel(arr[i])==true) 
				System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		String []array1 = {"aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"};
		new Assignment_40().PrintString(array1);
	}

}
