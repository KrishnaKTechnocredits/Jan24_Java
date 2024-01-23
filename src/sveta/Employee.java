package sveta;
class Employee{
	int pincode;
	String firstName, lastName, cmpName, city;
	
	void setPrimaryInfo(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;	
	}
	
	void setOtherInfo(String cmpName,String city, int pincode)
	{
		this.cmpName=cmpName;
		this.city=city;
		pincode=pincode;
	}
	
	void printAllDetail()
	{
		System.out.println("First Name is : " + firstName);
		System.out.println("Last Name is : " + lastName);
		System.out.println("Company Name is : " + cmpName);
		System.out.println("Pincode No. is :" + pincode);
		System.out.println("City Name is : " + city);
	}
	
	public static void main(String []args){
		Employee employee = new Employee(); 
		employee.setPrimaryInfo("techno", "credits");
		employee.setOtherInfo("ptc", "pune", 411045);
		employee.printAllDetail();
	}
	
}