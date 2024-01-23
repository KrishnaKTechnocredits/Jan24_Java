package suresh;

class Calcu{
		int a =10;
		int b =2;
	void add()
	{
		int ans = a +b;
		System.out.println(ans);
	}
		
	void sub()
	{
		int ans = a -  b;
		System.out.println(ans);
	}
		
	void div()
	{
		int ans= a / b; 
		System.out.println(ans);
	}
		
	void mul()
	{
		int ans = a * b;
		System.out.println(ans);
	}
		
	public static void main (String[] args)
	{
		Calcu calcu = new Calcu();
		calcu.add();
		calcu.sub();
		calcu.div();
		calcu.mul();
	}
}
		