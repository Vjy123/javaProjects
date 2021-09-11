package com.kuncham;
interface S
{
	void show();
}

public class Anonymous_intr {

	public static void main(String[] args) 
	{
		S s=new S()
		{
			public void show()
			{
				System.out.println("vijay");
			}
		};
	     s.show();

		
	}

}
