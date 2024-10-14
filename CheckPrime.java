package com.ssp.project1;

public class CheckPrime 
{
	public static void main(String[] args) 
	{
		int num = 23;
		Boolean flag = false;
		if(num <= 0)
			flag = true;
		for(int i = 2;i<=num/2;i++)
		{
			if(num % i == 0)
				flag = true;
		}
		if(!flag)
			System.out.println(num+ " is a prime");
		else
			System.out.println(num+ " is not a prime");
		}
		
}

