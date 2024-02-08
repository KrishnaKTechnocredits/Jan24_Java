package sveta;

public class Assignment_36_DivBy_3_5 {

	public static void division(int[] arr) {
		int allsum=0;
		int sumDivBy3=0;
		int sumDivBy5=0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%3 == 0 && arr[i]%5 != 0)
				sumDivBy3 += arr[i];	
			if(arr[i]%5 == 0 && arr[i]%3 != 0) 
				sumDivBy5 += arr[i];	
			if(arr[i]%3 == 0 && arr[i]%5 == 0) 
				allsum += arr[i];
		}
		System.out.println("div by 3 "+sumDivBy3);
		System.out.println("div by 5 "+sumDivBy5);
		System.out.println("sum for both "+allsum);
		
	}
	public static void main(String[] args) {
		int[] arr= {6, 5, 3, 15, 19, 40, 30, 27, 11};
		division(arr);
	}

}
