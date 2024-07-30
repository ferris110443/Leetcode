package Array;
/*
https://leetcode.com/problems/search-insert-position/
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

/
 */

public class SearchInsertPosition_0035 {
    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;

        while(r >= l){
            int mid = l + (r-l)/2 ;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                l = mid +1;

            }else {
                r = mid -1;
            }
        }

        return  l;

    }

}
