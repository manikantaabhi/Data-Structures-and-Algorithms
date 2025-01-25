package com.dsa.recursion;

public class PrintNums {

	public static void main(String[] args) {
		printNums(5);
	}

	public static void printNums(int n) {
		if(n<1)
			return;
		System.out.println(n);
		printNums(--n);
		System.out.println(n+1);
	}
}
