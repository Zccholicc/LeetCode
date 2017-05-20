/*
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
*/

public class FindUnsortedSubarray{
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){flag = true;}
            if(flag){min = Math.min(min,nums[i]);}
        }
        flag = false;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i]>nums[i+1]){flag = true;}
            if(flag){max = Math.max(max,nums[i]);}
        }
        int start ,end;
        for(start = 0; start<nums.length; start++){
            if(nums[start] > min){
                break;
            }
        }
        for(end = nums.length-1; end>=0; end--){
            if(nums[end] < max){
                break;
            }
        }
        return end - start < 0 ? 0 : end - start + 1;
    }
}

