package com.dsa.common;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println('0'-'1');
		System.out.println(addBin("1231",'1'));
	}
	public static String addBin(String number, char digit) {
		 String max="";
	        for(int i=0;i<number.length();i++)
	        {
	            if(number.charAt(i)==digit) {
	            	if((number.substring(0,i)+""+number.substring(i+1)).compareTo(max)>0)
	            		max=number.substring(0,i)+""+number.substring(i+1);
	            }
	        }
	        return max;
	}

}
