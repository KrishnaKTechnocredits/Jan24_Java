package rupali_umagol;

public class Assignment32 {
	void printReverse(int[] values) {
		for(int i=values.length-1;i>=0;i--) {
			System.out.println(values[i]);
		}
	}

	public static void main(String[] args) {
		Assignment32 assignment32=new Assignment32();
		int[] arr= {10, 20, 13, 27, 29, 13, 6};
		assignment32.printReverse(arr);
	}
}