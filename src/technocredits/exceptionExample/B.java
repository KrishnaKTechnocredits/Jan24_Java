package technocredits.exceptionExample;
class B{
	
	void m2(){
		System.out.println("B m2");
		C c = new C();
		c.m3(1);
		System.out.println("catch");
		System.out.println("B m2 end");
	}
}