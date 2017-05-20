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
}
