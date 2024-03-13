package varsha.eagersingleton;

//Assignment - 74 : 3rd March'2024
//Write an example for singleton design pattern on Builder class.
//Prove design patter works fine using BuilderClient class.
//Note : use eager loading implementation.

public class Builder {

	private static Builder builder = new Builder();

	final static Builder getConnection() {
		return builder;
	}
}
