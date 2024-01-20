package ashwini_b;


/*
I want to create a class called Employee. instance variable : firstName, lastName, cmpName, city, pincode

setPrimaryInfo(String firstName, String lastName)
setOtherInfo(String cmpName, String city, int pincode)
printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo("techno","credits") -> setOtherInfo("ptc","pune",411045) -> printAllDetails()
*/


class Employee{
   String firstName;
   String lastName;
   String cmpName;
   String city;
   int pincode;
     
	 void setPrimaryInfo(String firstName, String lastName){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  //System.out.println("FirstName is " + firstName + ", Lastname is " + lastName);
	 }
	 
	 void setOtherInfo(String cmpName, String city, int pincode){
	 this.cmpName = cmpName;
	 this.city = city;
	 this.pincode = pincode;
	 //System.out.println("company name is " + cmpName + ", City name is " + city + ", Pincode is " + pincode);
	 }
	 
	 void printAllDetails(){
	 System.out.println("FirstName is " + firstName + ", Lastname is " + lastName + ", company name is " + cmpName + ", City name is " + city + ", Pincode is " + pincode);
	 
	 }
	 
	 public static void main(String[] args){
	 Employee employee = new Employee();
	 employee.setPrimaryInfo("techno","credits");
	 employee.setOtherInfo("ptc","pune",411045);
	 employee.printAllDetails();
	 }
	} 