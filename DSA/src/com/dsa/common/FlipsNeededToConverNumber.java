package com.dsa.common;

public class FlipsNeededToConverNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(flipsNeeded(15, 9));
	}
	public static int flipsNeeded(int x,int y) {
		int ans=x^y;
		int count=0;
		for(int i=0;i<32;i++) {
			if((ans&(1<<i))>0)
				count++;
		}
		return count;
	}
}
