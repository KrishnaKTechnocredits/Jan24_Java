/*
Write an example for singleton design pattern on Builder class.
Prove design patter works fine using BuilderClient class.
Note : use eager loading implementation.
*/

package akshay_gaikwad;

public class Builder {
	
	private static Builder obj = new Builder();
	
	private Builder() {
	}
	
	static Builder getObject() {
		return obj;
	} 
}
