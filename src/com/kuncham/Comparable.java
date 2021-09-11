package com.kuncham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student 
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

public class Comparable {

	public static void main(String[] args) { 

		List<Student> s=new ArrayList<>();
		s.add(new Student(304,"vijay",305));
		s.add(new Student(205,"hari",406));
		s.add(new Student(605,"suresh",798));
		s.add(new Student(500,"gayathri",567));
		 
		Collections.sort(s,(i,j)->i.name.length()>j.name.length()?1:-1);
		//Collections.sort(s,(i,j)->i.marks>j.marks?1:-1);//Ascending elements
		//Collections.reverse(s);//Descending element
		//Collections.shuffle(s);//Random elements
		
		//System.out.println(s);
		for( Student ss:s)
		{
			System.out.println(ss);
		}

	}

}
