package shafaque;

public class Assignment19 {
	
	int count= 0;
	
	void casesensitive(String str ,char targetchar)
	   {
		    str = str.toLowerCase(); 
	   
	   for (int index = 0; index < str.length(); index++)
	  {
		   				
				if (targetchar == str.charAt(index)) 
				{
					count++;
				}
			}
			System.out.println("Frequency of t in technocredits is  " + count);
			
		}
		   

		public static void main(String[] args) 
		{
			Assignment19 assignment19 = new Assignment19();
			assignment19.casesensitive("technocrediTs teaches Technology", 't');
			
		}
	}

