package com.dsa.recursion;

public class Palindrome {

	public static void main(String[] args) {
		String str="miss, im";
		//System.out.println(Palin(str,0,str.length()-1));
		PalinWithSym(str);
	}
	public static boolean Palin(String str,int s, int e) {
		if(s>e)
			return true;
		if(str.charAt(s)!=str.charAt(e))
			return false;
		return Palin(str,s+1,e-1);
	}
	
	public static void PalinWithSym(String s){
		s=s.replaceAll("[^a-zA-z]", "");
		System.out.println(s);
		boolean isPalin=true;
		 for(int i=0,j=s.length()-1;i<s.length();i++,j--)
	        {
	           if(s.charAt(i)!=s.charAt(j))
	        	   isPalin=false;
	        }
		System.out.println(isPalin);
	}
	
}
