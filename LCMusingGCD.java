package com.ssp.project1;

public class LCMusingGCD 
{
	  public static void main(String[] args) {
	    int n1 = 72, n2 = 120;

	    int gcd = findGCD(n1, n2);
	    int lcm = (n1 * n2) / gcd;

	    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	    System.out.println("The GCD of" +n1+" and "+n2+" is "+gcd);
	  }

	  public static int findGCD(int a, int b) {
	    if (b == 0)
	      return a;
	    return findGCD(b, a % b);
	  }

}
