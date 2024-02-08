package shraddha;

class SumOfEvenNumArray{
	void sum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
			sum=sum+arr[i];
		}
		System.out.println("Sum of even numbers from given array is: "+sum);
	}
	
	public static void main(String[] args){
		SumOfEvenNumArray sumOfEven = new SumOfEvenNumArray();
		int[] arr={3, 6, 9, 11, 15, 20, 4, 26};
		sumOfEven.sum(arr);
	}
}