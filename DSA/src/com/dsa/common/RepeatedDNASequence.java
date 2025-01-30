package com.dsa.common;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class RepeatedDNASequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
	}
	public static List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map= new HashMap<String, Integer>();
        for(int i=0;i<=s.length()-10;i++)
        {
        	if(map.containsKey(s.substring(i,i+10)))
        	{
        		map.put(s.substring(i,i+10),map.get(s.substring(i,i+10))+1);
        	}
        	else
        		map.put(s.substring(i,i+10), 1);
        }
        List<String> li=new ArrayList<String>();
        for(Map.Entry<String, Integer> m:map.entrySet())
        {
        	if(m.getValue()>=2)
        		li.add(m.getKey());
        }
        return li;
    }
}
