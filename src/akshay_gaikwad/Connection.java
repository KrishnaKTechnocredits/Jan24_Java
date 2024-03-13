/* Write an example for singleton design pattern on Connection class.
Prove design patter works fine using client class.
Note : use lazy loading implementation. */

package akshay_gaikwad;

public class Connection {

	private static Connection obj;

	private Connection() {
	}

	static Connection getObject() {
		if (obj == null) {
			obj = new Connection();
		}
		return obj;
	}
}
