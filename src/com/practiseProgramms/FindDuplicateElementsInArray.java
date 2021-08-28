package com.practiseProgramms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicateElementsInArray {

	@Test
	public void findDuplicates()
	{
		String arr[]= {"java","selenium","java","C"};
		char c[]= {'c','a','v','a'};
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println("duplicate element found is: "+c[i]);
				}
			}
		}
	}
	
	@Test
	public void findDuplicatesUsingSetInterface()
	{
		String arr[]= {"java","selenium","java","C","C","selenium"};
		Set<String> str=new HashSet<String>();
		for(String s:arr)
		{
		if(str.add(s)==false)
		{
			System.out.println("duplicate element found is: "+s);
		}
		}	
	}
	
	@Test
	public void findDuplicatesUsingMapInterface()
	{
		String arr[]= {"java","selenium","java","C","C","selenium"};
		Map<String,Integer> str=new HashMap<String,Integer>();
		for(String s:arr)
		{
		Integer count=str.get(s);
		if(count==null)
		{
			str.put(s,1);
		}
		else
		{
			str.put(s,++count);
		}
		}	
		for(var e:str.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println("found duplicate element :"+e.getKey()+" "+"Repeated for :"+e.getValue());
			}
		}
	}
}
