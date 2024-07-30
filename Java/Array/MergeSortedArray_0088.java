package Array;

import java.util.Arrays;

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
