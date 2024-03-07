/*Assignment - 73 : 3rd March'2024
Write an example for singleton design pattern on Connection class.
Prove design patter works fine using client class.
Note : use lazy loading implementation. */
package sveta;

public class Assignment_73 {
	public static void main(String[] args) {
		Connection con1 = Connection.getObject();
		Connection con2 = Connection.getObject();
		Connection con3 = Connection.getObject();
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}
}
