package phenol_verma;

public class ArrMaxMin {
	void findMaxMin(int arr[]) {
		int maxNum = arr[0];
		int minNum = arr[0];
		
		for (int index = 0; index < arr.length; index++) 
			if (arr[index] > maxNum) 
				maxNum = arr[index];
			else if (arr[index] < minNum) 
				minNum = arr[index];
			
		System.out.println("Maximum Num - " + maxNum);
		System.out.println("Minimun Num - " + minNum);
	}
	
	public static void main(String[] args) {
		ArrMaxMin arrMaxMin = new ArrMaxMin();
		int arr[] = {10, 15, 20, 1, 25, 100, 3, 11};
		arrMaxMin.findMaxMin(arr);
	}

}
