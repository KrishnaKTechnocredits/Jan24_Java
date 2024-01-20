package arithmaticop;

public class ArithmaticOeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		substraction();
		mul();
		div();
	}


public static void addition()
{
	int a=10,b=20,c;
	c=a+b;
	System.out.println("Addtion= "+c);
	}
public static void substraction()
{
	int a=10,b=20,c;
	c=b-a;
	System.out.println("substraction= "+c);
	}
public static void div()
{
	int a=10,b=20,c;
	c=b/a;
	System.out.println("div= "+c);
	}public static void mul()
	{
		int a=10,b=20,c;
		c=b*a;
		System.out.println("mul= "+c);
		}
}