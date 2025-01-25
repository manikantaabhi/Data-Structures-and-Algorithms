package com.dsa.common;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveConsecutiveChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeCon("abbcdbccbb"));
	}
	public static String removeCon(String s) {
		Stack<Character> st=new Stack<Character>();
		String str="";
		for(int i=0;i<s.length();i++) {
			if(!st.isEmpty())
			{
				if(st.peek()!=s.charAt(i))
				{
					st.push(s.charAt(i));
					str+=s.charAt(i);
				}
			}
			else
			{
				st.push(s.charAt(i));
				str+=s.charAt(i);
			}
		}
		
		return str;
	}

}
