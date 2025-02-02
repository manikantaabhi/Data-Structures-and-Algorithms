package com.dsa.common;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryGap(12));
	}

	public static int binaryGap(int n) {
		int max = Integer.MIN_VALUE, count = 0, j = 0;
		for(int i=0;i<32;i++) {
			if((n&(1<<i))!=0)
			{
				count++;
				if(count==1)
					j=i;
				max=Math.max(max, i-j);
				j=i;
			}
		}
		if(count<=1)
			return 0;
		return max;
	}
}
