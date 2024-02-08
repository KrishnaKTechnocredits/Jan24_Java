package shravani_rapelli;

public class Assignment36 {
	
	int sumOfNumbersDivisible(int[] arr) {
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 3 == 0 || arr[i] % 5 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Output : " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment36 assign36 = new Assignment36();
		int[] arr= {6,5,3,15,19,40,30,27,11};
		assign36.sumOfNumbersDivisible(arr);
	}

}
