package rohit_sutar;

public class Assignment10 {

	void printEvenNumber(int startIndex, int endIndex) {
		System.out.println("Below numbers are even number between range of "+startIndex+" and "+endIndex);
		for(int i = startIndex ; i<=endIndex ; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment10 assignment10 = new Assignment10();
		assignment10.printEvenNumber(10, 15);
	}

}

