package sasmita;

public class Asssignment36 {
	
	void printNumberdivbythreeandfive(int[]arr){
	int sum = 0;
	for (int index = 0; index < arr.length; index++) {
		if(arr[index] % 3 == 0 || arr[index] % 5==0 ) {
			sum += arr[index];
		}

	}
	System.out.println("sum of digit div. by 3&5 is : " + sum);

}

public static void main(String[] args) {
	int[] arr = {6, 5, 3, 15, 19, 40, 30, 27, 11};
	Asssignment36  ass36 = new Asssignment36();
	ass36.printNumberdivbythreeandfive(arr);
}

}
