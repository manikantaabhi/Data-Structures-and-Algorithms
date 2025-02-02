package com.dsa.common;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class EqualPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,9,19,10,9,12,2,12,3,3,11,5,8,4,13,6,2,11,9,19,11,15,9,17,15,12,5,14,12,16,18,16,10,3,8,9,16,20,2,4,16,12,11,14,20,16,2,18,17,20,3,13,16,17,1,1,11,20,20,4};
		System.out.println(divideArray(arr));
	}

	public static boolean divideArray(int[] nums) {
		/*
		 * Arrays.stream(nums).boxed().collect(Collectors.groupingBy(num->num,Collectors
		 * .counting())).forEach((num,count)->System.out.println(num+":"+count));; int
		 * x=nums[0]; for(int i=1;i<nums.length;i++) { x=x^nums[i]; } if(x==0) return
		 * true; return false;
		 */
		 int num = 0;
	        for(int i = 0; i < nums.length; i++){
	            int ref = 1 << nums[i];
	            System.out.println(ref);
	            System.out.println(num^ref);
	            num = num^ref;
	        }
	        if(num == 0)return true;
	        return false;
    }
}
