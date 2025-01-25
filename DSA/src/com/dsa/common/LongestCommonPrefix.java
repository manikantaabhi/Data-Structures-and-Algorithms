package com.dsa.common;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        int len=strs[0].length();
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].length()<len)
            {
                len--;
            }
            while(!strs[i].substring(0,len).equals(strs[i-1].substring(0,len)))
            {
                len--;
            }
        }
        return strs[0].substring(0,len);
    }

}
