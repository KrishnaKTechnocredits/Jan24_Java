package samiksha;

class Employee{
    String firstName ,lastName, companyName,city;
	int pincode;
	void setPrimaryInfo(String firstname,String lastName) {
		this.firstName= firstname;
		this.lastName=lastName;
	}
	void setOtherInfo(String companyName, String city, int pincode){
		this.companyName=companyName;
		this.city=city;
		this.pincode=pincode;
	}
	
	void printAllDetails(){
		System.out.println("first name is " + firstName);
		System.out.println("last name is " + lastName);
		System.out.println("company name is " + companyName);
		System.out.println("city is " + city);
		System.out.println("pincode is " + pincode);
	}
	
	public static void main(String[]args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno","credits");
		employee.setOtherInfo("ptc","pune", 411045);
		employee.printAllDetails();
	}
}