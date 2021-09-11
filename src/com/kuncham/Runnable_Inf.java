package com.kuncham;
class T implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hoo");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class U implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("noo");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

public class Runnable_Inf {

	public static void main(String[] args)  throws Exception
	{
		T a=new T();
		U b=new U();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.start();
		try {Thread.sleep(500);}catch(Exception e) {}
		t2.start();
		t1.join();
		System.out.println("Vijay");
		t2.join();
		 
	}

}
