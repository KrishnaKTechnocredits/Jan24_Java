package akshay_gaikwad;
/*
Assignment - 93 : 25th March'2024 [18-20 mins]
1. WAP for swapping of two integers without using third variable.
2. WAP for swapping of two String without using third variable.
25 mins
*/

class SwapNumString{
	
	void swapNum(int num1, int num2){
		num1 = num1 + num2; 
		num2 = num1 - num2; 
		num1 = num1 - num2; 
		System.out.println(num1 + " -> " +num2);
	}
	
	void swapString(String str1 , String str2){
		//abcd xyz
		str1 = str1 + str2;  // abcdxyz xyz
		str2 = str1.substring(0,str1.length() - str2.length()); 
		str1 = str1.substring(str2.length());	
		System.out.println(str1 + " -> " +str2);
	}
	
	public static void main(String[] args){
		new SwapNumString().swapNum(10,20);
		new SwapNumString().swapString("Akshay","Shridhar");

	}
}