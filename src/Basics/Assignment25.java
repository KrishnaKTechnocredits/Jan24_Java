package Basics;

public class Assignment25 {
	void printnum(String str){
    	for(int i=0;i<str.length();i++){
    	char ch= str.charAt(i);
    		if(str.indexOf(ch)==str.lastIndexOf(ch)){
    			System.out.println(ch);
    		}
    	}
}
public static void main(String[] args) {
    Assignment25 assignment25 = new Assignment25();
    assignment25.printnum("technocredits");
    }
}