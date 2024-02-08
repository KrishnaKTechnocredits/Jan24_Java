package rupali_umagol;



public class Assignment35 {
	void sumIndex(int[] values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			if(i%2==0) {
				System.out.println(values[i]);
			sum=sum+values[i];	
			}
		}
		System.out.println("Sum on even index :"+sum);
	}
	
	public static void main(String[] args) {
		Assignment35 assignment35=new Assignment35();
		int[] arr={3, 6, 9, 11, 15, 20, 4, 26};
		assignment35.sumIndex(arr);
	}
}