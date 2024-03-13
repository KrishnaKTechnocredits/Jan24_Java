package rupali_umagol;

public class Assignment79 {

	void patternOneToSix() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	void patternStarAndHash() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if(i%2==0) 
				System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment79 assignment79=new Assignment79();
		assignment79.patternOneToSix();
		assignment79.patternStarAndHash();
		
	}
}
