package akshay_gaikwad;

class MaxMin{

	void maxNum(int num1, int num2){
		if(num1 > num2){
			System.out.println(num1 + " is bigger between " + num1 +" and " + num2);
		}else if (num2 > num1){
			System.out.println(num2 + " is bigger between " + num1 +" and " + num2);
		}else{
			System.out.println("Both are same numbers");
		}
	}
	
	void minNum(int num1, int num2){
		if(num1 < num2){
			System.out.println(num1 + " is smaller between " + num1 +" and " + num2);
		}else if (num2 < num1){
			System.out.println(num2 + " is smaller between " + num1 +" and " + num2);
		}else{
			System.out.println("Both are same numbers");
		}
	}
	
	public static void main(String[] args){
		MaxMin maxmin = new MaxMin();
		
		maxmin.maxNum(5,10);
		maxmin.maxNum(18,10);
		maxmin.maxNum(12,12);
		maxmin.minNum(5,10);
		maxmin.minNum(18,10);
	}
}