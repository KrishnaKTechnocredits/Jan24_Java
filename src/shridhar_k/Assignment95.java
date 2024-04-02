package shridhar_k;
//  second highest number
// input : {2,22,3,55,66,77,77,34,26}
//output : 66

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment95 {
    
    int heighestNum(int[] arr){
        int maxNum = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    
    int secondHeighestNum(int[] arr , int nu){ 
        int secondHeighestNum = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] >= nu){
                continue;
            }else{
                if(secondHeighestNum < arr[i]){
                   secondHeighestNum = arr[i]; 
                }
            }
        }
        return secondHeighestNum;
        //System.out.println(secondHeighestNum);
    }
    
    void nthHeighestNum(int[] arr , int n ) {
    	int nthHeighest = 0; //77 //66
    	for(int i =0;i < n ;i++) {
    		if(i == 0) {
    			nthHeighest = heighestNum(arr);
    		}else {
    			nthHeighest = secondHeighestNum(arr , nthHeighest );
    		}
    		
    	}
    	System.out.println(nthHeighest);
    }
    
    TreeSet <Integer> getIntegerArray(int[] arr){
        TreeSet<Integer> arrayofInteger = new TreeSet <> ();
        for(int num : arr){
            arrayofInteger.add(num);
        }
        return arrayofInteger;
    }
    
    void secondHeighestNumTreeSet(int[] arr){
        TreeSet<Integer> treeSetofInteger = getIntegerArray(arr);
        List<Integer> ListOfInteger = new ArrayList<> (treeSetofInteger); 
        Integer a = ListOfInteger.get(ListOfInteger.size()-2);
        System.out.println(a);
    }
    
    void removeDup(int[] arr , int num){
    
        for(int i = arr.length - 2 ;i >= 0;i--){
            if(arr[i] == num){
                arr[i] = 0;
            }else
                break;
        }
    }
    
    void freqWithSortingArray(int[] arr){
        Arrays.sort(arr);
        removeDup(arr , arr[arr.length -1]);
        Arrays.sort(arr);
        int secondHeighest = arr[arr.length - 2];
        System.out.println(secondHeighest);
    }
    
    void nthHeighestNumTreeSet(int[] arr , int n){
        TreeSet<Integer> setofInteger = getIntegerArray(arr);
        ArrayList <Integer> listOfInteger = new ArrayList <Integer> (setofInteger);
        
        System.out.println(listOfInteger.get(listOfInteger.size() - n));
        
    }
    

    public static void main(String[] args) {
        int[] arr= {2,22,3,55,66,77,77,34,26};
        System.out.println("Second heighest frequency by sorting arry");
        new Assignment95().freqWithSortingArray(arr );
        System.out.println("Customised Second heighest frequency by arry");
        new Assignment95().nthHeighestNum(arr , 2);
        System.out.println("Second heighest frequency by Treeset");
        new Assignment95().secondHeighestNumTreeSet(arr);
        System.out.println("Customised Second heighest frequency by Treeset");
        new Assignment95().nthHeighestNumTreeSet(arr , 2);
    }
}