package com.dsa.recursion;

public class PrintNameNTimes {

	public static void main(String[] args) {
		printName("Mani",5);
	}
	public static void printName(String name,int n) {
		if(n==0)
			return;
		System.out.println(name);
		printName(name,--n);
	}
}
