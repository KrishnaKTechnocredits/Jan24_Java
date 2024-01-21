package nikita_patil;
class Employee{
      String firstname;
	  String lastname;
	  String cmpName;
	  String city;
	  int pincode;
	  
	  void setPrimaryInfo(String firstname,String lastname){
	   this.firstname = firstname;
	  this.lastname = lastname;
	  }
	  
	  void setOtherInfo(String cmpName, String city, int pincode){
	  this.cmpName = cmpName;
	  this.city = city;
	  this.pincode = pincode;
	  
	  }
	  
	  void printAllDetails(){
	  System.out.println(" All employee details :" + " Firstname  is :" + firstname + "Lastname  is  :" + lastname + "Company name is : " +cmpName+ "City is :" + city +"Pincode is :"+pincode);
	  }
	  
	  public static void main(String[] args){
		  Employee e = new Employee();
		   e.setPrimaryInfo("techno","credits") ;
		  e.setOtherInfo("ptc","pune",411045);
		  e.printAllDetails();
	  }
}
