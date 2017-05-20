/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/
public class Rotate{
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        if(k>=nums.length){k = nums.length - k % nums.length;}
		else{k = nums.length-k;}
        System.arraycopy(nums,0,res,0,nums.length);
        System.arraycopy(res,k,nums,0,nums.length-k);
        System.arraycopy(res,0,nums,nums.length-k,k);
    }
}
