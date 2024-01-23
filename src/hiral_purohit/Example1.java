package hiral_purohit;

class Example1 {
	int a = 10;
	int b = 40;
	
	void m1(){
		int a = 90;
		Example1 example1 = new Example1();
		//Example1 example2 = new Example1();

		//example1.a = 30;
		//example2.b = 60;
			
		System.out.println(example1.b);
		System.out.println(a);	
	}
	
	public static void main(String[]args){
		Example1 example1 = new Example1();
		example1.m1();
	}
}