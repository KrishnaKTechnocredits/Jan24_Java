package rupali_umagol;

public class Assignment38 {
	void getMax(int[] values) {
		int max=0;
		for(int i=0;i<values.length;i++) {
			if(max<values[i]) {
				max=values[i];
			}	
		}
		System.out.println("Maximum values from Array : "+max);
	}
	
	void getMin(int[] values) {
		int min=values[0];
		for(int i=0;i<values.length;i++) {
			if(min>values[i]) {
				min=values[i];
			}
		}
		System.out.println("Minimum values from Array : "+min);
	}
	
	public static void main(String[] args) {
		Assignment38 assignment38=new Assignment38();
		int[] arr= {30,20,50,60,10};
		assignment38.getMax(arr);
		assignment38.getMin(arr);
	}
}
