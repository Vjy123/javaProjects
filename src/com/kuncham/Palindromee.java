package com.kuncham;

import java.util.Scanner;

public class Palindromee {

	public static void main(String[] args) 
	{   
		int n,r,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any num");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
		System.out.println("Num is palindrome :"+sum);
		
		}
		else
		{
			System.out.println("Not a Palindrome num");
		}
	}

}
