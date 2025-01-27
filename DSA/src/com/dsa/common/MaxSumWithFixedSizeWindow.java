package com.dsa.common;

public class MaxSumWithFixedSizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,12,1,12,15,4,7,9};
		int size=3;
		System.out.println(maxFixedSize(arr, size));
	}
	public static int maxFixedSize(int[] arr,int size) {
		int max=0;
		int currentSum=0;
		for(int i=0;i<arr.length;i++) {
			currentSum+=arr[i];
			if(i>=size-1) {
				max=Math.max(max, currentSum);
				currentSum-=arr[i+1-size];
			}
		}
		return max;
	}

}
