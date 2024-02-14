package atisha;

//print first five even number using for loop,doWhile loop, While loop
class Assignment20{
 

	
	void forLoop(){
		int count=0;
		for (int i=2; count<5 ;i+=2 )
		{
            System.out.println(i);
			count++;

		}
	}
    
	void doWhile(){
		int count=0;
		int num=2;
		do{
			System.out.println(num);
			num=num+2;
			count++;

	} while (count<5);

	}
	
	void whileLoop(){
		int count=0;
		int num=2;
		while(count<5){
			System.out.println(num);
			num=num+2;
			count++;
		}
	}
	public static void main(String []args){
		Assignment20 evm=new Assignment20();
		
		
		System.out.println("out put using for loop");
		evm.forLoop();
		
		System.out.println("___________________________");
		
		System.out.println("out put using do/while loop");
		evm.doWhile();
        
		System.out.println("___________________________");
		
		System.out.println("out put using while loop");
		evm.whileLoop();

	}
	
}