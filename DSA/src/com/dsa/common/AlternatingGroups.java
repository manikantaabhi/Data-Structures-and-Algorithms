package com.dsa.common;

public class AlternatingGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,0,1};
		System.out.println(numberOfAlternatingGroups(arr));
	}
	public static int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        for(int i=0;i<colors.length;i++){
            int start=i-1, end=i+1;
            if(start<0)
                start=colors.length-1;
            if(end>=colors.length)
                end=0;
            //System.out.println(start+" "+i+" "+end);
            if(colors[i]!=colors[start]&&colors[start]==colors[end])
                count++;
        }
        return count;
    }
}
