package sveta;

public class Assignment_42 {

	public int stringCheck(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))==true) 
				count++;
		 }
		 return count;
	}
	public void printString(String []arr)
	{
		for(int i=0;i<arr.length;i++) {
			String str=arr[i];
			int count =stringCheck(str);
			if(count>1)
				System.out.println(str);
		 }
	}
	
	public static void main(String[] args) {
		String []input = {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"};
		new Assignment_42().printString(input);
	}
}
