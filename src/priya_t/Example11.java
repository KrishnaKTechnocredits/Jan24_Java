package priya_t;

class Example11{
	
	int count1;
	int count2;
	
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
		Example11 example11 = new Example11();
		example11.m1();
		example11.m1();
		example11.m2();
		example11.m1();
		example11.m2();
		example11.display();
	}
}