package aanand.SingletonDesignPattern;

/*Write an example for singleton design pattern on Builder class.
Prove design patter works fine using BuilderClient class.
Note : use eager loading implementation.*/

public class Builder {

	private static Builder builder = new Builder();

	private Builder() {

	}

	static Builder getObject() {
		return builder;
	}
}