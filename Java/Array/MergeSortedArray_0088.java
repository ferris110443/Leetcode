package Array;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.


 */

public class MergeSortedArray_0088 {

    //Brutal Solution
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int j = 0 ;

        for(int i = nums1.length-1 ; i > nums1.length-1-n ; i-- ){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }

    // Optimal Solution
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        int[] answer = new int[m+n];

        int i = 0, j = 0, k = 0;

        while( i < m && j < n ){
            if( nums1[i] <= nums2[j]){
                answer[k] = nums1[i];
                k++;
                i++;
            }else{
                answer[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            answer[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n){
            answer[k] = nums2[j];
            k++;
            j++;
        }

        for(int a = 0 ; a < nums1.length ; a++){
            nums1[a] = answer[a];
        }
    }





}
