package com.practiseProgramms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class TestDuplicateWordInArrayUsingMapSet {

	@Test
	public void testUsingMap()
	{
		 String str1[]= {"kk","aa","aa","as","aa","kk","ss","as","check","check","gd","yh","gd"};
		 Map<String,Integer> obj=new HashMap<String,Integer>();
		 for(String val:str1)
		 {
			 Integer count=obj.get(val);
			 if(count==null)
			 {
				 obj.put(val,1);
			 }
			 else
			 {
				 obj.put(val,++count);
			 }
		 }
		 for(Entry<String,Integer> s:obj.entrySet())
		 {
			 if(s.getValue()>1)
			 {
				 System.out.println("Duplicate value is:"+s.getKey()+" Repeated for "+s.getValue()+" times");
			 }
		 }
	}
	
	
	
	@Test
	public void printDuplicateWordInArrayUsingSet()
	{
		 String str[]= {"kk","aa","as","aa","kk","ss","as","fff","fff"};
		 Set<String> obj=new HashSet<String>();
		for(String val:str)
		{
			if(obj.add(val)==false)
			{
				System.out.println("word repeated is:"+val);
			}
		}
   }
	
	@Test
	public void convertStringToArrayOfWords()
	{
		String s1="hello my name is karthik karthik";
		String arr[]=s1.split(" ");
		Map<String,Integer> obj=new HashMap<String,Integer>();
		 for(String val:arr)
		 {
			 Integer count=obj.get(val);
			 if(count==null)
			 {
				 obj.put(val,1);
			 }
			 else
			 {
				 obj.put(val,++count);
			 }
		 }
		 for(Entry<String,Integer> s:obj.entrySet())
		 {
			 if(s.getValue()>1)
			 {
				 System.out.println("Duplicate value is:"+s.getKey()+" Repeated for "+s.getValue()+" times");
			 }
		 }
	}
	
	@Test
	public void testReverseString() {
		String str="my name is angel";
		String rev="";
		StringBuilder sbr=new StringBuilder(str);
		System.out.println("Using in built method: "+sbr.reverse());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Using for loop: "+rev);
	}
	
	@Test
	public void stringCamelCase() {
		String str="my name is angel";
		String var="";
		String arr[]=str.split(" ");
		for(String s:arr)
		{
			var=s.substring(0,1).toUpperCase()+s.substring(1)+" ";
			System.out.print(var);
			//My Name Is Angel
		}
	}
	
	@Test
	public void stringCamelCaseReverseEachWord() {
		String str="my name is angel";
		String var;
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			var=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
			System.out.print(var);
			//Angel Is Name My
		}
	}
	
	@Test
	public void reverseEachWordOfAString() {
		String str="my name is angel ui yui tredf";
		String rev="";
		//System.out.println(new StringBuilder(str).reverse()+" ");
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print(new StringBuilder(arr[i]).reverse()+" ");
		    String word=arr[i];
			String reverseword="";
		    for(int j=word.length()-1;j>=0;j--)
		    {
		    	reverseword=reverseword+word.charAt(j);	
		    }
		   rev=rev+reverseword+" ";
		}
		  System.out.println(rev);
		  //ym eman si legna iu iuy fdert
	}
}
