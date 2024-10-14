package com.ssp.aug_12;

import java.util.Scanner;

public class FirstNonRepeating 
{
	public static String FirstNonRepeatingNumber(String str)
	{
		String result = "";
		for(int i = 0;i < str.length()-1;i++)
		{
			int count = 0;
			if(str.charAt(i) != ' ')
			{
				for(int j = 0;j<str.length();j++)
				{
					if(str.charAt(i) == str.charAt(j) && i != j)
					{
						count++;
						break;
					}
				}
				if(count == 0)
				{
					result += str.charAt(i);
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("FIRST NON-REPEATED CHARACTER IS:"+FirstNonRepeatingNumber(str));
		sc.close();
		
	}

}
