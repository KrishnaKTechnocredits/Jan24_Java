package technocredits;

class Example9{
	
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
		Example9 example9 = new Example9();
		example9.setData("techno",22);
		example9.printInfo();
	}
}

// CE
// RE
// null 0
// techno 22
