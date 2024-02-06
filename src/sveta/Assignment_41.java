package sveta;

public class Assignment_41 {

	public boolean stringCheck(String str) {
		boolean flag = false;
		 for(int i=0;i<str.length();i++) {
			 char ch = str.toLowerCase().charAt(0);
			 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {	
				 if(Character.isDigit(str.charAt(i))==true){
					 flag=true;
				}
			 }
		 }
		 return flag;
	}
	
	public void printString(String []arr)
	{
		for(int i=0;i<arr.length;i++) {
			String str=arr[i];
			boolean flag=false;
			if(stringCheck(str)==true)
				System.out.println(str);
			
		 }
	}
	
	public static void main(String[] args) {
		String []input = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"};
		Assignment_41 assignment_41=new Assignment_41();
		assignment_41.printString(input);
	}

}
