package com.ssp.project1;

//public class FibanocciSeries 
//{
//		 static int n1=0,n2=1,n3=0;    
//		 static void printFibonacci(int count){    
//		    if(count>0){    
//		         n3 = n1 + n2;    
//		         n1 = n2;    
//		         n2 = n3;    
//		         System.out.print(" "+n3);   
//		         printFibonacci(count-1);    
//		     }    
//		 }    
//		 public static void main(String args[]){    
//		  int count=10;    
//		  System.out.print(n1+" "+n2); 
//		  printFibonacci(count-2); 
//		 }   
//
//}
class FibanocciSeries {
	  public static void main(String[] args) {

	    int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }
	  }
	}

