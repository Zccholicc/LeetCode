/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.*;
public class TwoSum{
    public int[] solution(int[] nums,int target){
	HashMap<Integer,Integer> a = new HashMap<>();
	for(int n = 0; n<nums.length; n++){
	    int cm = target - nums[n];
	    if(a.containsKey(cm)){
		return new int[]{a.get(cm),n;}
	    }
	    a.put(nums[n],n);
	}
	throw new IllegalArgumentException();
    }
}
