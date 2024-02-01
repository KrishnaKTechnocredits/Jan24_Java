package apurva_arole;

public class Assignment26{
	void removevowelchar(String str){
		for(int i=0;i<str.length();i++){
			char ch= str.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
		String temp = String.valueOf(ch);
			str=str.replace(temp, "");
		}
    }
			System.out.println(str);
}
	
public static void main(String[] args) {
	   Assignment26 assignment26 = new Assignment26();
	   assignment26.removevowelchar("technocredits");
    }
}
