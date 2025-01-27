package com.dsa.common;
import java.util.*;
public class ContainsDuplicatesInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,2,3,4,5};
		System.out.println(containsDuplicates(arr, 3));
	}

	public static boolean containsDuplicates(int[] nums, int k) {
        int start=0;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int end=0;end<nums.length;end++){
            if(set.contains(nums[end]))
                return true;
            set.add(nums[end]);
            if(end>=k)
            {
                set.remove(nums[start]);
                start++;
            }
        }
        return false;
    }
}
