package hiral_purohit;

//Assignment - 4 : 17th Jan'2024

class Employee{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this. firstName = firstName;
		this. lastName = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
		
	void printAllDetails(){
		System.out.println("FirstName is--> " + firstName);
		System.out.println("LastName  is--> " + lastName);
		System.out.println("CmpName is --> " + cmpName);
		System.out.println("CityName is --> " + city);
		System.out.println("Pincode is --> " + pincode);	
	}

	public static void main(String[]args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno", "credits");
		employee.setOtherInfo("ptc", "pune", 411045);
		employee.printAllDetails();
	}	
	
}