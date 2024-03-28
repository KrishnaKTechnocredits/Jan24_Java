package technocredits.interview;

import java.util.Arrays;

public class InterviewArrayImpQuestion {
	
	boolean isNumPresent(int[] arr, int num) {
		for(int temp : arr) {
			if(temp == num)
				return true;
		}
		return false;
	}
	
	int[] processData(int[] arr) {
		int[] temp = new int[arr.length];
		int index = 0;
		for(int num : arr) {
			if(!isNumPresent(temp,num)) {
				temp[index] = num;
				index++;
			}
		}
		System.out.println(Arrays.toString(temp));
		int[] output = Arrays.copyOf(temp, index);
		System.out.println(Arrays.toString(output));
		return output;
	}
	
	public static void main(String[] args) {
		InterviewArrayImpQuestion interviewArrayImpQuestion = new InterviewArrayImpQuestion();
		int[] arr = {10,20,33,10,20,12,12,3,4,5,10,10,10};
		interviewArrayImpQuestion.processData(arr);
	}
}
