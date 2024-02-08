package aanand;

public class Assignment21 {
	static void sumNo() {
		int i=1, sum=0, count=0;
		while(sum<=150) {
			if(i % 6 == 0) {
				sum = sum + i;
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		sumNo();

	}

}
