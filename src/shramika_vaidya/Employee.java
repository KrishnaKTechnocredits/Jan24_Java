package shramika_vaidya;

class Employee{
	String firstName;
	String lastName;
	String companyName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInfo(String companyName, String city, int pincode){
		this.companyName = companyName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("FIRST_NAME IS " + firstName);
		System.out.println("LAST_NAME IS " + lastName);
		System.out.println("COMPANY_NAME IS " + companyName);
		System.out.println("CITY_NAME IS " + city);
		System.out.println("PINCODE = " + pincode);
	}
	
	public static void main( String[] args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("sona","kale");
		employee.setOtherInfo("Systemabio","Nagpur",442203);
		employee.printAllDetails();
	}
}