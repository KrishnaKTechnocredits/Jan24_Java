package shravani_rapelli;

class Employee{

	String firstName;
	String lastName;
	String companyName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void setOtherInfo(String companyName, String city, int pincode){
		this.companyName = companyName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("FristName is " + firstName);
		System.out.println("LastName is " + lastName);
		System.out.println("CompanyName is " + companyName);
		System.out.println("City is " + city);
		System.out.println("Pincode is " + pincode);
		
		
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno", "credits");
		employee.setOtherInfo("ptc", "pune", 413002);
		employee.printAllDetails();
	}

}