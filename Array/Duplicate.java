/*
  Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class Duplicate{
    public boolean containsDuplicate(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int b: nums){
            if(b<min){
                min=b;
            }
            if(b>max){
                max=b;
            }
        }
        boolean a[] = new boolean[max-min+1];
        for(int b: nums){
            if(a[b-min]){
                return true;
            }else{
                a[b-min]=true;
            }
        }
        return false;
    }

/*
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?
 */

    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1] >0 ){
                nums[index-1]=-nums[index-1];
            }
            else{
                res.add(index);
            }
        }
        return res;
    }
}

