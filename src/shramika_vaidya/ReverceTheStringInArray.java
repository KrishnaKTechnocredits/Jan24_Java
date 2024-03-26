package shramika_vaidya;

public class ReverceTheStringInArray {
	void getStringReversed(String[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		String str = "Kajol is Working in Roche";
		String[] arr = str.split(" ");
		new  ReverceTheStringInArray().getStringReversed(arr);
	}
}
