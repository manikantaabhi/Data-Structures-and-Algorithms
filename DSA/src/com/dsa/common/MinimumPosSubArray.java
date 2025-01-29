package com.dsa.common;

import java.util.ArrayList;
import java.util.List;

public class MinimumPosSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>();
		li.add(3);
		li.add(-2);
		li.add(1);
		li.add(4);
		System.out.println(minimumSumSubarray(li,2,3));

	}
	public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int lstart=0,rstart=0,lmin=Integer.MAX_VALUE,rmin=Integer.MAX_VALUE;
        int lsum=0,rsum=0;
        for(int i=0;i<nums.size();i++){
            lsum+=nums.get(i);
            rsum+=nums.get(i);
            if(i>=l-1)
            {
            	//System.out.println("lsum= "+lsum);
            	if(lsum>0)
                lmin=Math.min(lsum,lmin);
                lsum-=nums.get(lstart);
                lstart++;
            }
            if(i>=r-1)
            {
            	//System.out.println("rsum= "+rsum);
            	if(rsum>0)
                rmin=Math.min(rsum,rmin);
                rsum-=nums.get(rstart);
                rstart++;
            }
        }
       return lmin<rmin?lmin:rmin;
    }
}
