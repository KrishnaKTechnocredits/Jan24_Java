package ashwini_b;

class A {
    int a = 10;
	int b = 20;
	static int c = 100;
	 
	 
	void m1(){
	  int a = 20;
	  int b = 40;
	}
	
	public static void main (String args[]){
	   A a1 = new A();
	   A a2 = new A();
	   A a3 = new A();
	   
	   a1.b = 40;
	   a2.a = 50;
	   a3.c = 10;
	   
	   System.out.println(a1.a + a2.b + a2.c);
	   
	  }
}
	 
	 
	 /*
	 40
	 */
	 