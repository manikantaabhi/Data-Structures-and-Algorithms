package com.dsa.common;

public class BinarySubArraysWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,0,0,0,0};
		System.out.println(numSubarraysWithSum(nums, 0));
	}
	public static int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++) {
        	sum=0;
        	for(int j=i;j<nums.length;j++) {
        		sum+=nums[j];
        		if(sum==goal)
        			count++;
        		if(sum>goal)
        			break;
        	}
        	
        }
        return count;
    }

}
