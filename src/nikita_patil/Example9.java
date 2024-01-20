class Example9{
    int employeage; 
	String employename;
	
	void setData(String employename, int employeage){
	    this.employename = employename;
		this.employeage=employeage;
	}
	
	void printInfo(){
	     System.out.println("Employee name is : " + employename);
		 System.out.println("Employee age is : " + employeage);
		 }
		 
	public static void main(String[] args){
	    Example9 e = new Example9();
		e.setData("Nikita",19);
		e.printInfo();
		}
	}
		 		 

		 