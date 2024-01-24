package apurva_arole;

public class StringEx2 {
	void printfrequency(String input){
		int count=0;
			for(int index=0;index<input.length();index++){
				char ch= input.charAt(index);
				if(ch=='t') 
					count++;
			}
				System.out.println("frequency of t in technocredits is " + count);
	}
	    public static void main(String[] args) {
	    	StringEx2 stringEx2 = new StringEx2();
	    	stringEx2.printfrequency("technocredits");
		}
}


