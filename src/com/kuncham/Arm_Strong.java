package com.kuncham;

public class Arm_Strong {
	public static void main(String[] args)
	{
		int n=153,sum=0,temp,r;
		temp=n;
		
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("ArmStrong num:"+sum);
		}
		else
		{
			System.out.println("Not a Arm num");
		}

		 

	}

}
