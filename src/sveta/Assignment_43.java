package sveta;

public class Assignment_43 {
	
	public boolean isdDigit_isUpperCase_isLowerCase(String str){
		boolean flag = false;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch) != true && Character.isUpperCase(ch) != true && Character.isLowerCase(ch) != true)
				flag = true;
		}
		return flag;
	}
	
	public void printString(String []arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag = isdDigit_isUpperCase_isLowerCase(arr[i]);
			if(flag == true) 
				System.out.println(arr[i]);
		}
	}	
	
	public static void main(String[] args) {
		String []arr={"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		new Assignment_43().printString(arr);
	}
}
