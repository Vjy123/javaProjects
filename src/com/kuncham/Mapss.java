package com.kuncham;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapss {

	public static void main(String[] args) 
	{
		Map<String,Integer>m=new HashMap<>();
		m.put("vijay",405);
		m.put("Hari",506);
		m.put("Suresh", 407);
		System.out.println(m);
		Set<String>s=m.keySet();
		
		for(String r:s)
		{
			System.out.println(r+" "+m.get(r));
		}
		 

	}

}
