package com.dsa.common;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4};
		System.out.println(prefixSum(nums, 1, 3));
	}
	public static int prefixSum(int[] nums,int l,int r) {
		int []prefix=new int[nums.length];
		prefix[0]=nums[0];
		for(int i=1;i<nums.length;i++){
			prefix[i]=nums[i]+prefix[i-1];
		}
			
		if(l>0)
		{
			return prefix[r]-prefix[l-1];
		}
		return prefix[r];
	}

}
