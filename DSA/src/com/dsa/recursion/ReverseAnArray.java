package com.dsa.recursion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[]= {1,3,4,2,5};
		reverse(arr,0,arr.length-1);
		Arrays.stream(arr).forEach(x->System.out.println(x));
		
	}
	public static void reverse(int arr[],int s,int n)
	{
		if(s>n)
			return;
		int x=arr[s];
		arr[s]=arr[n];
		arr[n]=x;
		reverse(arr,s+1,n-1);
	}
}
