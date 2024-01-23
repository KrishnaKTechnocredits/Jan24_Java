package sasmita;

class DefaultValue{
	
	int output;// by default value is 0 of int
	String name;// string by default value is null
	
	void printoutput(){
		System.out.println("output is " + output);// output is 0
		System.out.println("Name is " + name);//output is null
	}
	
	void processdata(){
		int num1;
		String temp = null;
		num1 = 100;
		num1 = num1 +10;//100+10=110
		//temp = "10";//10//
		System.out.println(num1);//110
		System.out.println(temp);////10
	}
	
	public static void main(String[]args){
		DefaultValue def = new DefaultValue();
		def.printoutput();
		//def.processdata();//
	}
}
	