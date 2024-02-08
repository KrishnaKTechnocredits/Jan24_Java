package dharma;

public class DivBy_3_4 {

	public void division(int start, int end) {
		int count=0;
		for(int i=start;i<=end;i++) {
			if(i%3 ==0 && i%4 ==0) {
				System.out.println(i);
				count++;
			}if (count == 3) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		DivBy_3_4 dn = new DivBy_3_4();
		dn.division(10, 500);


	}

}
