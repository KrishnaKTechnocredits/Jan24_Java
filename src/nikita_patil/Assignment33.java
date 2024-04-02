package nikita_patil;

public class Assignment33 {
	
	public void sumOfDoubleArray(double[] arr) {
		double sum =0;
	 	for(int index = 0;index<arr.length;index++){
	 		sum+=arr[index];
	 	}
	 	System.out.println(sum);
	}
	
	public static void main(String []args) {
		double[] arr = {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		new Assignment33().sumOfDoubleArray(arr);
	}
}


