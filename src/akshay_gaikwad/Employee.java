package akshay_gaikwad;

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
		System.out.println(firstName + " " + lastName + " is employee of " + cmpName + " whoes address is " + city + ", " + pincode + ".");
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		
		employee.setPrimaryInfo("Akshay","Gaikwad");
		employee.setOtherInfo("Dassault Systems","Pune",411057);
		employee.printAllDetails();
	}
}