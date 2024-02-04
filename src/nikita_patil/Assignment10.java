package nikita_patil;

public class Assignment10 {
    void EvenNum(int startIndex, int endIndex) {
    	System.out.println("Even Numbers are:");
    	for(int count=startIndex; count<=endIndex; count++) {
    		if(count%2==0) {
    			System.out.println(count);
    			
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Assignment10 a = new Assignment10();
    	a.EvenNum(10,20);
    }
}

