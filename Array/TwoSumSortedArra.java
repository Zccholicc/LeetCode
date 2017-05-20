/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/

public class TwoSumSortedArra{
    public int[] twoSum(int[] numbers, int target) {
        int i =0, j=numbers.length-1;
        while(i < j){
            if(sum(numbers,i,j)<target){i++;}
            else if(sum(numbers,i,j)>target){j--;}
            else{break;}
        }
        return new int[]{i+1,j+1};
    }
    
    private int sum(int[] numbers, int i, int j){
        return numbers[i] + numbers[j];
    }
}
