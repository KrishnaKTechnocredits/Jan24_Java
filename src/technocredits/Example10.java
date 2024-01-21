package technocredits;

class Example10{
	
	int rno = 10;
	String name = "techno";

	void setData(int rno, String name){
		this.rno = rno;
		this.name = name;
	}		
	
	void updateData(String name){
		this.name = name;
	}
	
	void display(){
		System.out.println(rno + "->" + name);
	}
	
	public static void main(String[] args){
		Example10 example10_1 = new Example10();
		example10_1.setData(1,"credits");
			
		Example10 example10_2 = new Example10();
		example10_2.updateData("credits");

        example10_2.display();		
	}
}