package akshada_marne;

public class DiffOfSum {

	void sum(int[] num) {
		int sumeven=0;
		int sumodd=0;
		int difference=0;
		for(int i=0; i<num.length;i++) {
			if(num[i]%2==0) {
				sumeven=sumeven+num[i];	
				}
			if (num[i]%2!=0) {
				sumodd=sumodd+num[i];	
				}
				
			}
			if(sumeven>sumodd) {
				difference=sumeven-sumodd;
			}
			else {
				difference=sumodd-sumeven;
			}
			
			System.out.println("Difference of "+ sumeven + " and "+ sumodd +" is "+ difference	);
		}
		
	
	
	public static void main(String args[]) {
		DiffOfSum diffOfSum= new DiffOfSum();
		int[] arr= {30, 24, 19, 13, 36, 51, 11, 72};
		diffOfSum.sum(arr);
	}
}
