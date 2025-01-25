package com.dsa.recursion;

public class Add {

	public static void main(String[] args) {
		System.out.println(add(5));
	}
	public static int add(int n) {
		if(n==0)
			return n;
		return add(n-1);
	}
}
