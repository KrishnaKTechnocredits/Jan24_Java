package technocredits;


class Example8{
	
	int count1;
	int count2;
	String str;
	
	void m1(){
		//count1 = count1 + 1;
        //count1 += 1;
		count1 = count1 + 1;	
	}
	
	void m2(){
		count2++;
	}
	
	void display(){
		System.out.println("m1 call count : " + count1);
		System.out.println("m2 call count : " + count2);
	}
	
	public static void main(String[] args){
		Example8 example8 = new Example8();
		example8.m1();
		example8.m1();
		example8.m2();
		example8.m1();
		example8.m2();
		example8.display();
	}
}