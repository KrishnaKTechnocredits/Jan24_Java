package rupali_umagol;

class Maximum{
	int num1, num2;
	
	void min(int num1, int num2){
		if(num1 < num2){
			System.out.println(num1 + " is smaller between "+ num1+ " and "+num2);
		}else{
			System.out.println(num2 + " is smaller between "+ num1+ " and "+num2);
		}		
	}
	
	void max(int num1, int num2){
		if (num1 > num2){
			System.out.println(num1 + " is bigger between "+ num1+ " and "+num2);
		}else{
			System.out.println(num2 + " is bigger between "+ num1+ " and "+num2);
		}
	}
	
	public static void main(String[] args){
		Maximum maximum=new Maximum();
		maximum.min(10,17);
		maximum.max(10,17);	
	}
}