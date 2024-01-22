package shraddha;

/* Assignment - 15 : 21st Jan'2024
On user defined range print first 3 numbers which is divisible by 3 & 4.*/

class First{
	int first;
	
	void divisibleNum(int startRange, int endRange){
		for (int num = startRange; num <= endRange; num++){
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				first++;
				if(first == 3)
					break;
			}
		}
	}
		
		public static void main(String[] args){
			First first = new First();
			System.out.println("First 3 numbers divisible by 3 and 4 is :");
			first.divisibleNum(10,500);
		}
		
}