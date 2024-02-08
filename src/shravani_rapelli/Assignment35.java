package shravani_rapelli;

public class Assignment35 {
	
	int sumOfEvenNumbers(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(i % 2 == 0) {
				sum = sum + arr[i];
				
			}
		}
		System.out.println("Output : " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment35 assign35 = new Assignment35();
		int[] arr= {3,6,9,11,15,20,4,26};
		assign35.sumOfEvenNumbers(arr);
	}

}
