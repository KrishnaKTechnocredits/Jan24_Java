package ashwini_b;

/*
Assignment - 18 : 23th Jan'2024
2. Print character of given String in reverse order.
input : techno
output :
o
n
h
c
e
t
*/
public class StringRevs {
	 void printRevChar(String input) {
		 System.out.println("input:" +input);
		 System.out.println("output");
		    for(int index = input.length()-1 ; index >= 0 ; index --){
			    System.out.println(input.charAt(index));
				}
			}
		   
		   public static void main(String[] args){
			   StringRevs stringRevs = new StringRevs();   
			   stringRevs.printRevChar("techno");
			}
		 }
