package dharma;

public class DivBy_5_7 {

	public void divnum(int start,int end) {
		int sum=0;
		int count=0;
		for(int i=start;i<=end;i++) {
			if(i%5 == 0 && i%7 == 0) {
				System.out.println(i);
				sum+=i;
				count++;
			}
		    if(count==3)
		    	break;
		}
		System.out.println("sum is" + sum);
		System.out.println("Average is" + (sum/count));
	}
	
	public static void main(String[] args) {
		DivBy_5_7 dv = new DivBy_5_7();
		dv.divnum(1, 110);
		

	}

}
