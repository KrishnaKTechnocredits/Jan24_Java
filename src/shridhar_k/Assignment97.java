package shridhar_k;
// [45 mins]
// 11.1 Find whether number is ArmStrong
// input : 153
// output : 153 is an armStrong number.

// 11.2 return sum of all the argStrong number from give array. 
// input : {153,27,1624,99}
// output : 153 + 1624

class Assignment97 {
    
    boolean getNumberisArmstrong(int num){
        int addition = 0;
        String str = num + "";
        int length = str.length();
        for(int i =0;i< length;i++){
            int tempNum = 1;
            char ch = str.charAt(i);
            int numOfStr = Character.getNumericValue(ch);
            for(int j =0 ;j< length ; j++){
                tempNum *= numOfStr;
            }
            addition += tempNum;
        }
        if(num == addition) {
        	return true;
        }
        else {
        	return false;
		}    
    }
    
    void printNumberisArmstrong(int num){
    	if(getNumberisArmstrong(num)) {
    		System.out.println(num + " number is ArmStrong number");
    	}else
    		System.out.println(num + " number is not ArmStrong number"); 
    }
    
    void sumOfargStrongnumber(int[] arr) {
    	int addition = 0;
    	for(int num : arr) {
    		if(getNumberisArmstrong(num)) {
    			addition += num;
    		}
    	}
    	System.out.println("Sum of all the argStrong number from give array : " + addition );
    }
    
    public static void main(String[] args) {
    	int[] input = {153,27,1634,99};
        new Assignment97().printNumberisArmstrong(153);
        new Assignment97().sumOfargStrongnumber(input);
    }
}