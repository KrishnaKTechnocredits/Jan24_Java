package shraddha;

class Assignment67{
	String splitString(String str){
		String str1 ="";
		String reverseString ="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				reverseString= reverseString+reverse(str1);
				reverseString = reverseString + " ";
				str1="";
			}
			else{
				str1 = str1+str.charAt(i);
			}
		}
		reverseString= reverseString+reverse(str1);
		return reverseString;
	}
	
	String reverse(String str){
		String str2 ="";
		for(int i=str.length()-1;i>=0;i--)
			str2 = str2+str.charAt(i);
		return str2;
	}
	
	String initialCapital(String str){
		String str1 ="";
		for (int i=0;i<str.length();i++){
			if(i==0)
				str1 = ""+Character.toUpperCase(str.charAt(i));
			else if(str.charAt(i)==' '){
				str1=str1+" ";
				str1=str1+Character.toUpperCase(str.charAt(i+1));
				i++;
			}
			else
				str1=str1+Character.toLowerCase(str.charAt(i));
		}
		return str1+ " ";
	}
		
	String initialCapitalReverse(String str){
		String str1 = splitString(str);
		String str2 = initialCapital(str1);
		return str2;
	}	
	
	public static void main(String[] args){
		Assignment67 ass67 = new Assignment67();
		String str = ass67.splitString("Hi Hello Maulik");
		System.out.println(str);
		String str2 = ass67.initialCapital("hi hEllO how are you");
		System.out.println(str2);
		String str3 = ass67.initialCapitalReverse("Hi Hello Maulik");
		System.out.println(str3);
	}
}