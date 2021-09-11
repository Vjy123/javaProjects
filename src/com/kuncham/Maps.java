package com.kuncham;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

			public static void main(String[] args) 
			{
				Map m=new HashMap();
				m.put("1","304");
				m.put("2", "406");
				m.put("3", "597");
				
				//System.out.print(m);
				
				Set s=m.keySet();
				
				for(Object o:s)
				{
					System.out.println(o+" "+m.get(o));
				}
			
				
				

			}

		

	}
