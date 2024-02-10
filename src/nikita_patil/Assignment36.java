package nikita_patil;

public class Assignment36 {
	void getSumOfNumbers(int[] input) {
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]%3==0 || input[i]%5==0)
				sum=sum+input[i];
		}
		System.out.println("Sum of numbers in string that are divisible by 3 or 5 is : "+sum);
			}

			public static void main(String[] args) {
				int[] arr = {6, 5, 3, 15, 19, 40, 30, 27, 11};
				Assignment36 a = new Assignment36();
				a.getSumOfNumbers(arr);
			}

		}

