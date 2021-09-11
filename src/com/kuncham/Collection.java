package com.kuncham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

	public static void main(String[] args) 
	{
		List<Integer> l=new ArrayList<>();
		l.add(304);
		l.add(506);
		l.add(203);
		l.add(407);
		l.add(188);
		//System.out.println(l);
	 Collections.sort(l,(i,j)->i%10>j%10?1:-1);//last Element Sorting in Ascending Order
	   // Collections.reverse(l);//Descending Order
		//Collections.shuffle(l);//Random Order
		for(Integer o:l)
		{
			System.out.println(o);
		}

	}

}
