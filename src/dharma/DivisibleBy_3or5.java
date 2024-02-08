package dharma;

public class DivisibleBy_3or5 {

	void sumIndex(int[] Values) {
		int sum = 0;
		for(int i=0;i<Values.length;i++) {
			if(Values[i]%3 ==0 ||Values[i]%5 ==0) {
				sum = sum + Values[i];
				
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		DivisibleBy_3or5 divby3or5 = new DivisibleBy_3or5();
		int[] arr= {6, 5, 3, 15, 19, 40, 30, 27, 11};
		divby3or5.sumIndex(arr);

	}

}
