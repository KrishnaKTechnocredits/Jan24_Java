package akshay_gaikwad;
/*11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.

11.2 return sum of all the argStrong number from give array. 
input : {153,27,1624,99}
output : 153 + 1624
12:27 :: 12 :43
*/
class ArmStrongNum{
	
	boolean isArmStrongNum(int num){
		int count = 0,sum = 0;
		int temp = num;
		while(temp > 0){
			temp = temp / 10;
			count++;
		}
		temp = num;
		while(temp > 0){
			int currDigit = temp % 10;
			sum += Math.pow(currDigit,count);
			temp = temp/10;
		}
		return num == sum ? true : false; 
	}
	
	int sumOfArmStrongNum(int [] arr){
		int sum = 0;
		for(int num : arr){
			if(isArmStrongNum(num)){
				sum += num;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		int [] input = {153,27,1634,99};
		System.out.println(new ArmStrongNum().isArmStrongNum(1624));
		System.out.println(new ArmStrongNum().sumOfArmStrongNum(input));
	}
}