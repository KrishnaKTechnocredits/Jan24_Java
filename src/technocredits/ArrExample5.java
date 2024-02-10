package technocredits;

public class ArrExample5 {
	static private String credentials = "faajh";
	
	private static boolean flag = false;
	
	static private void m1() {
		
	}
	
	private int getNumberFromStr(String str){
		String temp = "0";
		for(int index=0;index<str.length();index++){
			char ch = str.charAt(index);
			if(Character.isDigit(ch)){
				temp = temp + ch;
			}
		}
		return Integer.parseInt(temp); 
	} 

	int[] getNumArray(String[] input){
		System.out.println(credentials);
		int[] num = new int[input.length];
		for(int index=0;index<input.length;index++){
			num[index] = getNumberFromStr(input[index]);	
		}
		return num;
	}
}
