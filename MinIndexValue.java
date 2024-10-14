package com.ssp.project1;

public class MinIndexValue 
{
	public static void main(String[] args)
	{
		int [] arr = {23,12,34,2,5,15};
		int min = 0;
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[min] > arr[i])
				min = i;
		}
		System.out.println("Minimum value index position is:"+min);
	}

}
