package rohit_sutar;

public class Assignment15 {
	
	void print1st3No(int startIndex, int endIndex) {
		int count =0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for(int i=startIndex ; i<=endIndex ; i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(i);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] arg) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.print1st3No(10, 50);
	}

}
