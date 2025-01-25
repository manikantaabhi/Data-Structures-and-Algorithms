package com.dsa.recursion;

public class SumOfNNumbers {

	public static void main(String[] args) {
		System.out.println(Sum(5));
	}
	public static int Sum(int n) {
		if(n==1)
			return n;
		return n*Sum(n-1);
	}

}
