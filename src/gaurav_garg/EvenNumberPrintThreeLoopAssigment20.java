package gaurav_garg;

public class EvenNumberPrintThreeLoopAssigment20 {

	void forLoop(int numb1)
	{
		 int count=0;
		System.out.println("for Loop answer");
		for(int i=1;count<numb1;i=i+1)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;
			}
		}
	}
	
	void whileLoop(int numb1)
	{
		int count=0;
		System.out.println("while Loop answer");
		int i=1;
		while(count<5)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
	
	void dowhile(int numb1)
	{
		int count=0;
		System.out.println("do while answer");
		int i=1;
		do {
			if(i%2==0)
			{
				System.out.println(i);
				count++;
			}
			
			
			i++;
		}while(count<5);
	}
	
	public static void main(String[] args) {
		EvenNumberPrintThreeLoopAssigment20 evennumberprintthreeloopassigment20 =new EvenNumberPrintThreeLoopAssigment20();
		evennumberprintthreeloopassigment20.forLoop(5);
		evennumberprintthreeloopassigment20.whileLoop(5);
		evennumberprintthreeloopassigment20.dowhile(5);
	}
}
