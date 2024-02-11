package technocredits;

class ArrExample1 {

	void add(int[] num){
		
		for(int index=0;index<num.length;index++){
			System.out.println(num[index]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		ArrExample1 arrExample1 = new ArrExample1();
		arrExample1.add(arr);
	}
}
