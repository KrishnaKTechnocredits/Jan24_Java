package technocredits;

public class StaticNonStaticEx3 {

	int x = 10;
	static String name = "Techno";
	
	static void m1(){
		StaticNonStaticEx3 testProg = new StaticNonStaticEx3();
		testProg.m2();
	}
	
	String m2(){
		String ans = m3(11);
		return ans;
	}
	
	static String m3(int x){
		if(x == 10){
			return "Hi";
		}
		System.out.println("Hello");
		return "Techno";
	}
	
	public static void main(String[] args){
		StaticNonStaticEx3 test = new StaticNonStaticEx3();
		String ans = test.m2();
		System.out.println(ans);
	}
}
