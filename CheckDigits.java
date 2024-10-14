package com.ssp.project1;

import java.util.Scanner;

public class CheckDigits
{
	public static boolean digits(String str)
	{
		char [] charArray = str.toCharArray();
		for(int i = 0;i < charArray.length;i++)
		if(charArray[i] >= '0' && charArray[i] <= '9')
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("Is String contains digits:"+digits(str));
	}

}
