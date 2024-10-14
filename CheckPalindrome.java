package com.ssp.project1;

import java.util.Scanner;

public class CheckPalindrome
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		a = sc.nextInt();
		int temp = a,sum = 0,r;
		while(a>0)
		{
			r = a % 10;
			sum = (sum * 10) + r;
			a /= 10;
		}
		if(sum == temp)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");

	}

}
