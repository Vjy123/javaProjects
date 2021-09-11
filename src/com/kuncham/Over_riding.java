package com.kuncham;
class A
{
	public void show(int i) {
		System.out.println("haii");
	}
}
class B extends A
{   @Override
	public void show(int i)
	{
		System.out.println("hello");
	}
	
}
class C extends A
{  @Override
	public void show(int i)
	{
		System.out.println("vijay");
	}
}

public class Over_riding {

	public static void main(String[] args) 
	{
		
        A a=new B();//run time Polymorphism
        a.show(1);
        a=new C();//Dynamic Method Dispatching
        a.show(2);
	}

}
