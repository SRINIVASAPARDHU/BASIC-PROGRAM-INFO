package com.ssp.aug_12;

public class MethodChaining
{
	public static void main(String[] args) 
	{
		String str = "india";
	    int len =	str.concat(" is great").toUpperCase().length();
	    System.out.println(len);
	    
	    String str1 = "india";
	    char ch = str1.concat(" is great").toUpperCase().charAt(1);
	    System.out.println(ch);
	}
}
