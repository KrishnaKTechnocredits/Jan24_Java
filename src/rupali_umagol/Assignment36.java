package rupali_umagol;

public class Assignment36 {
	void sumOfAll(int[] values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			if(values[i]%3==0 || values[i]%5==0) {
				sum=sum+values[i];
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment36 assignment36=new Assignment36();
		int[] arr={6, 5, 3, 15, 19, 40, 30, 27, 11};
		assignment36.sumOfAll(arr);
	}
}
