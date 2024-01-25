package akshay_gaikwad;

public class AllLoops {
	void forLoop5Even(int num) {
		int count = 0;
		for(int index = 1 ; count < num ; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
				count++;
			}
		}
	}
	
	void whileLoop5Even(int num) {
		int count = 0;
		int index = 1;
		while(count < num) {
			if (index % 2 == 0) {
				System.out.println(index);
				count++;
			} 
			index++;
		}
	}
	
	void doWhileLoop5Even(int num) {
		int count = 0;
		int index = 1;
		do{
			if(index % 2 == 0) {
				System.out.println(index);
				count++;
			}
			index++;
		}while(count < num);
	}
	
	
	public static void main(String[] args) {
		AllLoops allloops = new AllLoops();
		allloops.forLoop5Even(5);
		System.out.println("---------------");
		allloops.whileLoop5Even(5);
		System.out.println("---------------");
		allloops.doWhileLoop5Even(5);
	}
}
