package com.dsa.common;

import java.util.ArrayList;
import java.util.List;

public class SubsetsBitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,4};
		System.out.println(possibleSets(nums));
	}
	public static List<ArrayList<Integer>> possibleSets(int[] nums){
		int n=1<<nums.length;
		List<ArrayList<Integer>> fin=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			ArrayList<Integer> li= new ArrayList<Integer>();
			for(int j=0;j<nums.length;j++) {
				if((i & (1<<j))>0)
				{
					li.add(nums[j]);
				}
			}
			fin.add(li);
		}
		return fin;
	}

}
