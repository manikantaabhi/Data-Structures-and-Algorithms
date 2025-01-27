package com.dsa.common;

import java.util.*;

public class LongestSubstringWithNoRepeatingChars {

	public static void main(String[] args) {
		
		lengthOfLongestSubstring("Manikantaabhi");
	}
	 public static int lengthOfLongestSubstring(String s) {
	        int start=0,maxLength=0;
	        HashSet<Character> set=new HashSet<Character>();
	        for(int end=0;end<s.length();end++){
	            while(set.contains(s.charAt(end)))
	            {
	                set.remove(s.charAt(start));
	                start++;
	            }
	            set.add(s.charAt(end));
	            maxLength=Math.max(maxLength,end-start+1);
	        }
	        return maxLength;
	    }
}
