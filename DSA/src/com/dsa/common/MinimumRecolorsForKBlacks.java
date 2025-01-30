package com.dsa.common;

public class MinimumRecolorsForKBlacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="WBWBBBW";
		System.out.println(minimumRecolors(str, 2));
	}
	 public static int minimumRecolors(String blocks, int k) {
		 int start=0,min=Integer.MAX_VALUE,count=0;
		 for(int i=0;i<blocks.length();i++) {
			 if(blocks.charAt(i)=='W')
				 count++;
			 if(i>=k-1) {
				 min=Math.min(min, count);
				 if(blocks.charAt(start)=='W')
				 {
					 count--;
				 }
				 start++;
			 }
			 
		 }
		 return min;
	 }
}
