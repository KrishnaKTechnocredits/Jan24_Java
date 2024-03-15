package technocredits.exceptionExample;

public class InvalidBrowserException extends RuntimeException{

	public InvalidBrowserException() {
		super("Browser is invalid");
	}
	
	public InvalidBrowserException(String message) {
		super(message);
	}
}
