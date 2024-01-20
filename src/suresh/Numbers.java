package suresh;

class Numbers
{
	void maxNumb(int a, int b)
	{
		if (a<b)
		{
		System.out.println(a+"  is smaller between "+a+ "and "+b);
		}
		
		if(b>a)
		{
		System.out.println(b+"  is bigger between "+a+ "and "+b);
		}
	}
	public static void main(String[]args)
	{
		Numbers numbers = new Numbers();
		numbers.maxNumb(10,17);
	}
}
		
	