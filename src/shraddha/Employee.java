package shraddha;

class Employee{

	String firstName,lastName,cmpName,city;
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
		System.out.println("Employee FirstName:" + firstName);
		System.out.println("Employee LastName:" + lastName);
		System.out.println("Employee CompanyName:" + cmpName);
		System.out.println("Employee City:" + city);
		System.out.println("Employee Pincode:"+ pincode);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("ABC","XYZ");
		employee.setOtherInfo("Techno","Pune",411013);
		employee.printAllDetails();
		
	}
}