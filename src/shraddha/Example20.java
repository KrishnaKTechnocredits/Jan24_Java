package shraddha;

class Example20{
	void forLoopExp(){
		System.out.println("-------For Loop------");
		for(int i=1;i<=10;i++){
			if(i%2==0)
				System.out.println("First 5 even numbers are : "+i);
		}
	}
	
	void whileLoopExp(){
		System.out.println("-------While Loop------");
		int i=1;
		while(i<=10){
			if(i%2==0)
				System.out.println("First5 even numbers are : "+i);
			i++;
		}
	}
	
	void doWhileLoopExp(){
		System.out.println("-------DoWhile Loop------");
		int i=1;
		do{
			if(i%2==0)
				System.out.println("First5 even numbers are : "+i);
			i++;
		}
		while(i<=10);
	}

	public static void main(String[] args){
		Example20 example = new Example20();
		example.forLoopExp();
		example.whileLoopExp();
		example.doWhileLoopExp();
	}
}