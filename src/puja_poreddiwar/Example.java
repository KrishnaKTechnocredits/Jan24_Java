package puja_poreddiwar;

class Example{
	int a =10;
	int b =20;
	
	void m1(){
		int a =90;
		Example example1= new Example();
		Example example2= new Example();
		
		example1.a = 50;
		example2.b = 100;
		
		System.out.println(example1.b);
		System.out.println(example2.a);
	}
		
		public static void main(String agrs[])
		{ 
		Example example1 = new Example();
		example1.m1();
		}
}

