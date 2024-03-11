/*
 * Use lazy loading implementation.
 */

package puja_poreddiwar;

public class Assignment73Client {

	public static void main(String[] args) {
		Connection con1 = Connection.getObject();
		Connection con2 = Connection.getObject();
		Connection con3 = Connection.getObject();
		
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}

}
