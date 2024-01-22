package dharma;

public class DivisibleBy_3_5 {
	
	public void div(int start, int end) {
		for(int i=start;i<=end;i++) {
			if(i%3 == 0 && i%5 ==0) {
				System.out.println(i);
			}
		}
	}
       
	public static void main(String[] args) {
		DivisibleBy_3_5 divisiblenumber = new DivisibleBy_3_5();
		divisiblenumber.div(5, 40);

	}

}
