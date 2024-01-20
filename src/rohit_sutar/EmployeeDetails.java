package rohit_sutar;

class EmployeeDetails{
	String firstName, lastName, companyName, city;
	int pincode;
	
	void setPrimaryInf(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInf(String companyName, String city, int pincode){
		this.companyName = companyName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printEmpDetails(){
		System.out.println("Employee First Name is "+firstName+" and Last Name is "+lastName);
		System.out.println("Company Name is "+companyName+" which is located in "+city+" - "+pincode);
	}
	
	public static void main(String args[]){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setPrimaryInf("Rohit", "Sutar");
		employeeDetails.setOtherInf("Amazon", "Pune", 411043);
		employeeDetails.printEmpDetails();
	}
}