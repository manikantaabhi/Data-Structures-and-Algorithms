package com.dsa.common;

import java.util.*;
import java.util.Map.Entry;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dups("manimanimanikkl");
	}
	
	public static void Dups(String str) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else
				map.put(str.charAt(i), 1);
		}
		for (Entry<Character, Integer> map1 : map.entrySet()) {
				System.out.println(map1.getKey()+", "+"count= "+map1.getValue());
		}
	}

}
