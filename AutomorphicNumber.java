package com.ssp.project1;
import java.util.Scanner;  
public class AutomorphicNumber  
{

	public static void main(String args[])  
	{  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number to check: ");
		int a = sc.nextInt();  
		int count=0;  
		int square = a*a;  
		int t = a;  
		while(t>0)
		{
			count++;  
			t=t/10;  
		}
		int lastDigit = (int) (square%(Math.pow(10, count)));   
		if(a == lastDigit)  
		System.out.println(a+ " is an automorphic number.");  
		else  
		System.out.println(a+ " is not an automorphic number.");  
		sc.close();
	}  
}  
		
		
  
  
 


