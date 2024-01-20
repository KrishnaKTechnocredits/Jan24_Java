package priya_t;

class Example13{
	
	String employeeName;
	int employeeAge;
	
	void setData(String employeeName, int employeeAge){
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}
	
	void printInfo(){
		System.out.println("Employee name is " + employeeName);
		System.out.println("Employee age is " + employeeAge);
	}
	
	public static void main(String[] args){
		Example13 example13 = new Example13();
		example13.setData("techno",22);
		example13.printInfo();
	}
}