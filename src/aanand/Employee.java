package aanand;

class Employee{
	String firstName, lastName, cmpName, city;
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
		System.out.println("First name:	" + firstName);
		System.out.println("Last name:	" + lastName);
		System.out.println("Company name:	" + cmpName);
		System.out.println("City name:	" + city);
		System.out.println("Pincode:	" + pincode);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno", "credits");
		employee.setOtherInfo("PTC","Pune",411045);
		employee.printAllDetails();
	}
}