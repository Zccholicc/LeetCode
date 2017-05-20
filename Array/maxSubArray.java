/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class maxSubArray{
    public int maxSubArray(int[] nums) {
        int whole_max = 0,max = 0,negative = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            max += nums[i];
            negative =Math.max(negative,max);
            max = Math.max(0,max);
            whole_max = Math.max(max,whole_max);
        }
        if(whole_max == 0){return negative;}
        else{return whole_max;}
    }
}

/* Dynamic Programming Example
public class Solution {
    public int maxSubArray(int[] nums) {
       int[] dp = new int[nums.length];
       dp[0]=nums[0];
       int res = dp[0];
       for(int i=1;i<nums.length;i++){
           dp[i] = Math.max(nums[i]+dp[i-1], nums[i]);
           res=Math.max(dp[i],res);
       }
       return res;
    }
}
*／
