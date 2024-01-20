package prathamesh_tati;

class Employee{
	
	String firstName; 
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("Employee First Name = " + firstName);
		System.out.println("Employee Last Name = " + lastName);
		System.out.println("Employee Company Name = " + cmpName);
		System.out.println("Employee City = " + city);
		System.out.println("Employee Pincode = " + pincode);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno","credits");
		employee.setOtherInfo("ptc","pune",411045);
		employee.printAllDetails();
	}
}