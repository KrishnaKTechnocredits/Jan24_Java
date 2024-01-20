
package priya_t;

class Example9{

      String EmployeeName;
      int EmployeeAge;
	  
	  void setData(String EmployeeName,int EmployeeAge){
	  
	  this.EmployeeName=EmployeeName;
	  this.EmployeeAge= EmployeeAge;
	  
	  }
	  
	  void PrintInfo(){
	  
	  System.out.println("EmployeeName is= "   +EmployeeName);
	  System.out.println("EmployeeAge is= "   +EmployeeAge);
	  
	  }
	  
	 public static void main(String[] args){
	  Example9 example=new Example9();
	  example.setData("Techno",27);
	  example.PrintInfo();
	  
	  }
}