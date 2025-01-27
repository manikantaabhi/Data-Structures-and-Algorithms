package com.dsa.common;

public class FindMaxAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,7};
		System.out.println(findMaxAverage(arr, 4));
	}
	
	public static double findMaxAverage(int[] nums, int k) {
        int start=0;
        double maxAvg=Integer.MIN_VALUE;
        int sum=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            if(end>=k-1)
            {
                maxAvg=Math.max(maxAvg,(double)sum/k);
                sum-=nums[start];
                start++;
            }
        }
        return maxAvg;
    }

}
