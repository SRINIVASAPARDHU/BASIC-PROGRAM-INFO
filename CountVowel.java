package com.interview;

public class CountVowel
{
	public static void main(String[] args) 
	{
		String str = "Hello World";
		int count = 0;
		for(char c: str.toCharArray())
		{
			if("aeiouAEIOU".indexOf(c) != -1)
			{
				count++;
			}
		}
		System.out.println("Vowels count is:"+count);

	}

}
