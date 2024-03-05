/*
 * Assignment73
 */

package puja_poreddiwar;

public class Connection {
	
	private static Connection con = null;
	
	private Connection () {
	}
	
	static Connection getObject() {
		if(con == null) 
		con = new Connection();
			return con;
	}
}
