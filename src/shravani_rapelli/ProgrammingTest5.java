package shravani_rapelli;
import java.util.Arrays;

public class ProgrammingTest5 {

	int[] getNum(int arr[]) {
		int cnt=0;
		for(int num : arr) {
			if(num%5==0)
				cnt++;
		}
		int[] output = new int[cnt];
		int i=0;
		for(int num : arr) {
			if(num%5==0) {
				output[i]=num;
				i++;
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		ProgrammingTest5 prgmngtest5 = new ProgrammingTest5();
		int[] arr = {10,32,44,55,25,23};
		int[] output = prgmngtest5.getNum(arr);
		System.out.println(Arrays.toString(output));
	}
}
