package apurva_arole;

public class Assignment4 {
	String Firstname;
	  String Lastname;
	  String Companyname;
	  String City;
	  int Pincode;
	   
	  void SetprimaryInfo(String Firstname, String Lastname){
	      this.Firstname=Firstname;
	      this.Lastname=Lastname;
	  }
	  void SetotherInfo(String Companyname, String City, int Pincode){
	      this.Companyname=Companyname;
	      this.City=City;
	      this.Pincode=Pincode;
	  }
	  void PrintAllDetails(){
	      System.out.println("Employee name is:"+ Firstname +Lastname);
	      System.out.println("Employee Company name is:" + Companyname);
	      System.out.println("Employee address: "+ City+" ,"+Pincode);
	  } 
	  public static void main(String [] args){
	      Assignment4 assignment4 = new Assignment4();
	      assignment4.SetprimaryInfo("Apurva","Arole");
	      assignment4.SetotherInfo("UBISOFT","pune",410507);
	      assignment4.PrintAllDetails();
	  }
}
