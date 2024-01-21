package shridhar_k;

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
	
	void printAlldetails(){
		System.out.println("Employee details as followas");
		System.out.println("Frist Name = " + firstName + ", Last Name = "+ lastName);
		System.out.println("Other info of employee as follows");
		System.out.println("Company name = "+ cmpName + ", City = " + city + ", Pincode = " + pincode);
	}
	
	public static void main(String[] arg){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno","credits");
		employee.setOtherInfo("ptc","pune",411045);
		employee.printAlldetails();
	}
	
}