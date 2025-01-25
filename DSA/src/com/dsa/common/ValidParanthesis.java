package com.dsa.common;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("{[]}]"));
		

	}
	
	public static boolean isValid(String s) {
		Stack<Character> ch = new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{'||s.charAt(i)=='['|| s.charAt(i)=='(') {
				ch.push(s.charAt(i));
			}
			else {
				if(ch.empty())
					return false;
				if(s.charAt(i)=='}')
					if(ch.peek()!='{')
						return false;
					else
						ch.pop();
				if(s.charAt(i)==']')
					if(ch.peek()!='[')
						return false;
					else
						ch.pop();
				if(s.charAt(i)==')')
					if(ch.peek()!='(')
						return false;
					else
						ch.pop();
			}
		}
		if(ch.isEmpty())
			return true;
		else
			return false;
	}

}
