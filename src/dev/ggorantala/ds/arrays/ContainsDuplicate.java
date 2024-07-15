package dev.ggorantala.ds.arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Coding Interview Problem
 *
 * @author ggorantala
 * @url https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(linearSearch(nums));
        System.out.println(sorting(nums));
        System.out.println(hashtable(nums));
    }

    // naive or linear search
    static boolean linearSearch(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // sorting array
    static boolean sorting(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // hash table
    static boolean hashtable(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}
