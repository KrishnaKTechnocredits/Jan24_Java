package dharma;

public class DivBy_5_10 {

	public void divNum(int start,int end) {
		int number=0;
		for(int i=start;i<=end;i++) {
			if(i%5 ==0 && i%10 ==0) {
				number+=i;
			}
		}System.out.println("sum is" + number);
	}
	public static void main(String[] args) {
		DivBy_5_10 dv = new DivBy_5_10();
		dv.divNum(10, 50);
		

	}

}
