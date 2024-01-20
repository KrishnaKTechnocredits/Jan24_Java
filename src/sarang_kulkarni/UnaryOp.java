package sarang_kulkarni;


public class UnaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=23;
a++;
System.out.println("a= "+a);
a=23;
a--;
System.out.println("a="+a);

++a;
System.out.println("a="+a);
--a;
System.out.println("a="+a);

int b;
b=a++;
System.out.println("b="+b);
System.out.println("a="+a);

b=++a;
System.out.println("b="+b);
System.out.println("a="+a);

b=a--;
System.out.println("b="+b);
System.out.println("a="+a);

b=--a;
System.out.println("b="+b);
System.out.println("a="+a);

int c;

c=~a;// increments a by one and assign -ve sign(Negation Operator)
System.out.println("c="+c);

boolean x=true,y;
y=!x;
System.out.println("y="+y);


	}

}
