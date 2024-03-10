/*Assignment - 74 : 3rd March'2024
Write an example for singleton design pattern on Builder class.
Prove design patter works fine using BuilderClient class.
Note : use eager loading implementation. */
package sveta;

public class Manager {

	private static Manager con;
	static{
		con = new Manager();
	}
	
	 static Manager getObject() {		
			return con;
	}
}
