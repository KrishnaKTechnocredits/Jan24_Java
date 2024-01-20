package shraddha;

class Static{
	int a=10;
	int b=20;
	static int c=30;
	
	void m1(){
		int a=20;
		int b=30;
	}

	public static void main(String[] args){
		Static a1 = new Static();
		Static a2 = new Static();
		Static a3 = new Static();
		
		a1.a = 30;
		a2.b = 50;
		Static.c = 100;
		
		System.out.println(a1.b + a2.a + a2.c);// 20+10+100
	}
	
		
}