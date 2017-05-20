/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0


The return value of Binary Search !
 */
public class SearchInsert{
    public int searchInsert(int[] nums, int target) {
        return help(nums,target,0,nums.length-1);
    }
    public int help(int[] nums, int target , int lo ,int hi){
        if(lo > hi){return lo;} 
        int mid = lo + (hi-lo)/2;
        if(nums[mid] > target){return help(nums,target,lo,mid-1);}
        else if(nums[mid] < target){return help(nums,target,mid+1,hi);}
        else{return mid;}
    }
}
