package rupali_umagol;

public class Assignment21 {
	int count;

	void numberReslt() {
		int sum=0;
		int num=1;
		while(sum<=150) {
			if(num%6==0) {
				sum=sum+num;
				count++;
			}
				num++;	
		}
		System.out.println("Result :" + count);
	}
	
	public static void main(String[] args) {
		Assignment21 assignment21=new Assignment21();
		assignment21.numberReslt();	
	}
}
