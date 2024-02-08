package shraddha;

class SumOfArray{
	double sum(double[] arr){
		double sum=0;
		for (int i=0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		
		System.out.println("Sum of given array is: "+sum);
		return sum;
	}
	
	public static void main(String[] args){
		SumOfArray sumOfArray = new SumOfArray();
		double[] arr1= {10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		sumOfArray.sum(arr1);
	}
}