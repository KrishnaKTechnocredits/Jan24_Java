package hiral_purohit;

public class Division73 {
	
	void processData(int startRange, int endRange){
		for (int index =startRange ; index >=endRange ; index--){
			if( index % 7  == 0 )
				System.out.println(index + " is divisble by 7");
			else if( index % 13  == 0 )
				System.out.println(index + " is divisble by 13");
		}
	}
	
	public static void main (String[] args) {
		Division73 division73 = new Division73();
		division73.processData(40, 5);
	}
}
