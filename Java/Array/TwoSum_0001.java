package Array;
//https://leetcode.com/problems/two-sum/
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]


import java.util.HashMap;
public class TwoSum_0001 {
    // Brutal force solution
    // Time complexity: O(n^2)
    // Space complexity: O(1)
    public int[] solution1(int[] nums , int target){

        for(int i = 0 ; i < nums.length ; i++ ){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    // HashMap solution
    // Time complexity: O(n)
    // Space complexity: O(n)
    public int[] solution2(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


