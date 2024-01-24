package apurva_arole;

public class StringEx1 {
		void printnum(String input){
			for(int index=input.length()-1;index>=0;index--){
				System.out.println(input.charAt(index));
			}
		}
	    public static void main(String[] args) {
	    	StringEx1 stringEx1 = new StringEx1();
	    	stringEx1.printnum("techno");
		}
}
