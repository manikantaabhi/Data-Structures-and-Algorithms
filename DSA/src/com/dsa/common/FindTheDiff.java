package com.dsa.common;

import java.util.Arrays;

public class FindTheDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("", "y"));
	}
	 public static char findTheDifference(String s, String t) {
	       char[] x= s.toCharArray();
	       char[] y= t.toCharArray();
	       Arrays.sort(x);
	       Arrays.sort(y);
	       for(int i=0;i<s.length();i++)
	    	   if(x[i]!=y[i])
	    		   return x[i];
	       return y[y.length-1];
	    }

}
