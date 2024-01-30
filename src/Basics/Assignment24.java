package Basics;

public class Assignment24{
       void printnum(String str){
        	for(int i=0;i<str.length();i++){
        	char ch= str.charAt(i);
        	if(i==str.indexOf(ch)){
        		if(str.indexOf(ch)!= str.lastIndexOf(ch)){
        			System.out.println(ch);
        		}
        	}
        }
}
public static void main(String[] args) {
	    Assignment24 assignment24 = new Assignment24();
	    assignment24.printnum("aakanksha");
	}
}
