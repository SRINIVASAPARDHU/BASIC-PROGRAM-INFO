package com.ssp.project1;

public class PrimeUpto
{
	public static void main(String[] args)
	{
		System.out.println("Prime numbers upto the range");
		int count,i;
		for(i = 2;i<=100;i++)
		{
			count = 0;
			for(int j = i;j > 1;j--)
			{
				if(i % j == 0)
					count++;
			}
			if(count == 1)
				System.out.print(i+ " ");
		}
		
	}

}
