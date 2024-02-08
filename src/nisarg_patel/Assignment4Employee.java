package nisarg_patel;

/*I want to create a class called Employee. instance variable : firstName, lastName, cmpName, city, pincode

setPrimaryInfo(String firstName, String lastName)
setOtherInfo(String cmpName, String city, int pincode)
printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo("techno","credits") -> setOtherInfo("ptc","pune",411045) -> printAllDetails() */


class Assignment4Employee{
	String first_Name;
	String last_Name;
	String companyName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		first_Name = firstName;
		last_Name = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		companyName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("First Name : " + first_Name);
		System.out.println("Last Name : " + last_Name);
		System.out.println("Company Name : " + companyName);
		System.out.println("City Name : " + city);
		System.out.println("Pincode Number : " + pincode);
	}
	
	public static void main(String[] args){
		Assignment4Employee assignment4Employee = new Assignment4Employee();
		assignment4Employee.setPrimaryInfo("Nisarg","Patel");
		assignment4Employee.setOtherInfo("Techno Credits","Ahmedabad",380001);
		assignment4Employee.printAllDetails();
	}
}