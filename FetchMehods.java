package com.ssp.aug_12;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class FetchMehods 
{
	public static void main(String[] args) 
	{
	Vector<String> fruits = new Vector<>();
	fruits.add("Apple");
	fruits.add("Orange");
	fruits.add("Grapes");
	fruits.add("Mango");
	fruits.add("Guava");
	
	System.out.println("USING TO STRING METHOD");
	System.out.println(fruits.toString());
	System.out.println("------------------------");
	
	System.out.println("USING ORDINARY FOR LOOP");
	for(int i = 0;i<fruits.size();i++)
	{
		System.out.println(fruits.get(i));
	}
		System.out.println("USING FOR EACH LOOP");
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		System.out.println("BY USING ITERATOR INTERFACE");
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("BY USING ENUMERATION INTERFACE");
		Enumeration<String> ele = fruits.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		System.out.println("BY USING LIST ITERATOR");
		System.out.println("FORWARD DIRECTION");
		ListIterator<String> lst = fruits.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		System.out.println("----------------");
		System.out.println("BACKWARD DIRECTION");
		while(lst.hasPrevious())
		{
			System.out.println(lst.previous());
		}
		System.out.println("BY USING SPLITERATOR");
		Spliterator<String> spl = fruits.spliterator();
		spl.forEachRemaining(fruit -> System.out.println(fruit));
		
		System.out.println("BY USING FOR EACH CONSUMER METHOD");
		fruits.forEach(fruit -> System.out.println(fruit));
		
		System.out.println("BY USING METHOD REFERENCE");
		fruits.forEach(System.out::println);
			
		
		
	}
	

}
