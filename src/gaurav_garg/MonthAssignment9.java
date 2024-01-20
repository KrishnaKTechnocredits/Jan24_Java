package gaurav_garg;

 class MonthAssignment9
 {
	 
	 void month(int indexmonth)
	 {
		 if (indexmonth >= 1 && indexmonth <= 3)
		 {
			 System.out.println("1st quater");
			 if(indexmonth == 1)
			 {
				 System.out.println("its is January month");
			 }else if(indexmonth == 2)
			 {
				System.out.println("its is febrarury month"); 
			 }else
			 {
				 System.out.println("its is March month"); 
			 }
		 }else if (indexmonth >=4 && indexmonth <=6)
		 {
			 System.out.println("2nd quater");
			 if(indexmonth ==4 )
			 {
				 System.out.println("its is April month");
			 }else if(indexmonth == 5)
			 {
				System.out.println("its is May month");
			 }else
			 {
				 System.out.println("its is June month");
			 }	
		 }else if (indexmonth >=7 && indexmonth <=9)
		 {
			 System.out.println("3rd quater");
			 if(indexmonth ==7 )
			 {
				 System.out.println("its is July month");
			 }else if(indexmonth == 8)
			 {
				System.out.println("its is August month");
			 }else
			 {
				 System.out.println("its is September month");
			 }	
		 }else if (indexmonth >=10 && indexmonth <=12)
		 {
			 System.out.println("4th quater");
			 if(indexmonth ==10 )
			 {
				 System.out.println("its is October month");
			 }else if(indexmonth == 11)
			 {
				System.out.println("its is November month");
			 }else
			 {
				 System.out.println("its is December month");
			 }	
		 }else
		 {
			 System.out.println("invalid Month");
		 } 
	 }
	 
	 public static void main(String...s)
	 {
		 MonthAssignment9 monthassignment9 = new MonthAssignment9();
		 monthassignment9.month(5);
		 monthassignment9.month(9);
		 monthassignment9.month(14);
		 monthassignment9.month(-2);
		 
	 }
	 
 }