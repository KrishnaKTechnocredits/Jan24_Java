package varsha;

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

	void printAllDetail(){
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("cmpName : " + cmpName);
		System.out.println("city : " + city);
		System.out.println("pincode : " + pincode);
	}

	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno", "credits");
		employee.setOtherInfo("ptc", "pune", 411045);
		employee.printAllDetail();
	}
}
