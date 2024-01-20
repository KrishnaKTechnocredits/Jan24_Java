package hiral_purohit;

//Assignment - 7 : 18th Jan'2024

class Example2{
	int num1;
	int num2;
	
	void m1(int num1, int num2){
		if (num1 < num2){
		System.out.println( num1 + " is smaller between " + num1 + " and " +num2);
		}
	}
	
	void m2(int num1,int num2){	
		
	if(num2 > num1){
		System.out.println( num2 + " is bigger between " + num1 + " and " +num2);
		}
	}	
	
    public static void main(String[]args){
		Example2 example2 = new Example2();
		example2.m1(10,17);
		example2.m2(10,17);
	}		
}