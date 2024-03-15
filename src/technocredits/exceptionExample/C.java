package technocredits.exceptionExample;

class C {

	void m3(int x) throws RuntimeException{
		System.out.println("C m3");
		x--;
		int ans = 10 / x;
		System.out.println(ans);
		System.out.println("C m3 end");
	}
}
