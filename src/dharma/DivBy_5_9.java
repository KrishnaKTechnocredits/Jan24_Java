package dharma;

public class DivBy_5_9 {
	
	public void divNum(int start,int end) {
		int number=0;
		for(int i=start;i<=end;i++) {
			if(i%5 ==0 && i%9 ==0) {
				number=i;
			}
			
		}
		System.out.println(number);
	}

	public static void main(String[] args) {
		DivBy_5_9 dn = new DivBy_5_9();
		dn.divNum(5, 100);

	}

}
