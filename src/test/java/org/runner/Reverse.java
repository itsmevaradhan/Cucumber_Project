package org.runner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		String str= "margorp ym si siht olleh";
		String rev="";
		
		for (int i = str.length()-1; i>=0; i--) 
		{
			char c = str.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);
		
	}
}
