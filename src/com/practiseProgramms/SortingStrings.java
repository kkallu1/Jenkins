package com.practiseProgramms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortingStrings {

	@Test
	public void testStringsSort()
	{
		String arr[]= {"karthik","sanju","apple","banana"};
		Arrays.sort(arr);
		Arrays.parallelSort(arr,Collections.reverseOrder());
		Set<String> strs=new TreeSet<String>();
		for(String s:arr)
		{
		   strs.add(s);
		}
		System.out.println("sorted string using treeset: "+strs);
		
		String temp=null;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	for(String str:arr)
	{
		System.out.println(str);
	}
	
	
	
	
	}
}
