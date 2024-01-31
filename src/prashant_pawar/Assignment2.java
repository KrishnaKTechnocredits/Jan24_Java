package prashant_pawar;

class Assignment2{
	int amount;
	
	void add(int num1,int num2){
		amount=amount+(num1+num2);
	}
	
	void sub(int num1,int num2){
		amount=amount+(num1-num2);
	}
	
	void mul(int num1,int num2){
		amount=amount+(num1*num2);
	}
	
	void div(int num1,int num2){
			amount=amount+(num1/num2);
	}
	
	void sumOfAll(){
		System.out.println("Total of all functions is-:"+ amount);
	}
	
	public static void main(String[] args){
		Assignment2 assignmnet = new Assignment2();
		assignmnet.add(30,60);
		assignmnet.sub(100,82);
		assignmnet.mul(70,20);
		assignmnet.div(10,2);
		assignmnet.sumOfAll();
	}	

}