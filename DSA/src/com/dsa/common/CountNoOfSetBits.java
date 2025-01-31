package com.dsa.common;

public class CountNoOfSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBits(5));
		
	}
	public static int countBits(int n)
	{
		int count=0;
		for(int i=0;i<32;i++)
		{
			System.out.println((n&(1<<i)));
			if((n&(1<<i))>0)
			count++;
		}
		return count;
	}

}
