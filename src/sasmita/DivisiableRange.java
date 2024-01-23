package sasmita;

public class DivisiableRange {
	
	void printDivisiable(int startRange, int endRange){
		int count=1;
		for(int i=startRange; i<= endRange; i++) {
			if(i%3 == 0 && i%4 == 0) {
				if (count <= 3) {
				 System.out.println(i);
				 count++;
				}
			    else
				break;	
		    } 
	   }
	}
	public static void main(String[]args){
		DivisiableRange div = new DivisiableRange();
		div.printDivisiable(10,500);
	}
}
