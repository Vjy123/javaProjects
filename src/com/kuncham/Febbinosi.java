package com.kuncham;

import java.util.Scanner;

public class Febbinosi {

	public static void main(String[] args) 
	{
		int n,a=0,b=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any num");
		n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 a=b;
			 b=c;
			 c=a+b;
		 }
		  System.out.println(a);
		
		 
	}

}
