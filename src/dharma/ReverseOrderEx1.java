package dharma;

public class ReverseOrderEx1 {

	void printReverse(int[] values) {
		for(int i=values.length-1;i>=0;i--) {
			System.out.println(values[i]);
		}
	}

	public static void main(String[] args) {
		ReverseOrderEx1 reverseorderex1=new ReverseOrderEx1();
		int[] arr= {10, 20, 13, 27, 29, 13, 6};
		reverseorderex1.printReverse(arr);
	}
}
