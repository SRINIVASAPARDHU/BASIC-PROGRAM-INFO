package com.ssp.aug_12;

import java.util.Scanner;

public class RemoveDuplicates 
{
	public static String RemoveDuplicateCharacters(String str)
	{
		String result="";
		for(int i = 0;i < str.length();i++)
		{
		int count = 0;
		if(str.charAt(i) != 0)
		{ 
			for(int j = i +1;j < str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j) && i != j)
				{
					count++;
				}
			}
			if(count == 0)
			{
				result += str.charAt(i)+" ";
			}
		}
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println(RemoveDuplicateCharacters(str));
		sc.close();
	}

}
