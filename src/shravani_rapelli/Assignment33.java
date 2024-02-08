package shravani_rapelli;

public class Assignment33 {
	
	void sumOfDouble(double[] arr) {
		double sum=0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Output : "+ sum );
	}
	
	public static void main(String[] args) {
		Assignment33 assign33 = new Assignment33();
		double[] input= {10.2,45.50,34.65,20.60,25.46,78.90};
		assign33.sumOfDouble(input);
	}
}
