package technocredits.interview;

public class StringBufferDemo {
	
	
	static int getLength(char[] ch) {
		int count = 0;
		for(int index=0;index<ch.length;index++) {
			
			if(ch[index] != '\u0000') {
				count++;
			}
			
		}
		return count;
	}
	
	int getCapacity(char[] ch) {
		return ch.length;
	}
	
	
	public static void main(String[] args) {
		char[] arr = new char[20];
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = ' ';
		arr[3] = '_';
		arr[4] = ' ';
		arr[7] = 'S';
		
		int len = getLength(arr);
		System.out.println("Used array length is " + len);
		
		StringBuilder buffer = new StringBuilder("Hi");
		buffer.append("no");
		//buffer.append("credits");
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		buffer.reverse();
		System.out.println(buffer);
		
	}
}
