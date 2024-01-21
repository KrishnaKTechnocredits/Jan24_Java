package ankita_s;

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
		System.out.println ("Here are the all 5 instance variable" + "\nfirstName:- " + firstName
		+ "\nlastName:- " + lastName + "\ncmpName:- " + cmpName + "\ncity:- " + city + "\npincode:- " + pincode);
	}
	
	public static void main (String[] args){
		Employee employee = new Employee();
		employee.setPrimaryInfo("techno","credits");
		employee.setOtherInfo("ptc","pune",411045);
		employee.printAllDetails();
	}
}

