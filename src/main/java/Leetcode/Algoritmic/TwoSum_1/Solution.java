package Leetcode.Algoritmic.TwoSum_1;

import java.util.Arrays;

class Solution {
    //TODO Можно оптимизировать
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {2,7,11,15}; int target1 = 9;
        int[] arr2 = new int[] {3,2,4}; int target2 = 6;
        int[] arr3 = new int[] {3,3}; int target3 = 6;

        twoSum(arr1, 9);
        twoSum(arr2, 6);
        twoSum(arr3, 6);

    }
}