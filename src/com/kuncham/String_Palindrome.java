package com.kuncham;

public class String_Palindrome {

	public static void main(String[] args) {
		 String str="kuncham";
		 String rev=new StringBuffer(str).reverse().toString();
		 if(str.equals(rev))
		 {
			 System.out.println("Num is a palindrome num:"+rev);
		 }
		else
		 {
			 System.out.println("Not a Palindrome num");
		 }

	}

}
