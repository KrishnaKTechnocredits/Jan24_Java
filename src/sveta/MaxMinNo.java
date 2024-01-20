package sveta;
class MaxMinNo{

	void minNo(int num1, int num2){
		
		if (num1 < num2){
			
			System.out.println(num1 + " is Smaller Number Between " + num1 + " and " + num2);
			
		} else{
			
			System.out.println(num2 + " is Smaller Number Between " + num1 + " and " + num2);
			
		}
	}
	
	void maxNo(int num1, int num2){
		
		if (num1 > num2){
			
			System.out.println(num1 + " is Bigger Number Between " + num1 + " and " + num2);
			
		} else{
			
			System.out.println(num2 + " is Bigger Number Between " + num1 + " and " + num2);
			
		}
	}

	public static void main(String[] args){
		
		MaxMinNo maxminno = new MaxMinNo();
		maxminno.minNo(10,17);
		maxminno.maxNo(10,17);
		
	}
}