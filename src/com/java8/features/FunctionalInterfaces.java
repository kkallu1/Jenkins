package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FunctionalInterfaces implements Test {

	@Override
	public void test2() {
		System.out.println("hello from fi");
		
	}
	
	@org.testng.annotations.Test
	public void testtt()
	{
		int[] arr=new int[] {1,2,3,4,6,7,8,9};
		int n = arr.length;
		 
        // the actual size is `n+1` since a number is missing from the array
        int m = n + 1;
 
        // get a sum of integers between 1 and `n+1`
        int total = m * (m + 1) / 2;
 
        // get an actual sum of integers in the array
        int sum = Arrays.stream(arr).sum();
	System.out.println(total-sum);
	}
	
	

	private void reverseString(String str) {
		if ((str==null)||(str.length() <= 1))   
			System.out.println(str);   
			else  {
		System.out.print(str.charAt(str.length()-1));
		
		reverseString(str.substring(0,str.length()-1));
			}
	}

	public static void main(String[] args)
	{
		printsequence();
	};
		
		/*
		 * Optional<String> stringOptional =users. stream().
		 * map(user->user.getPhoneNumbers().stream())
		 * .flatMap(test->test.filter(phone->phone.equals("6"))) .findAny();
		 * stringOptional.ifPresent(System.out::println);
		 */
		
		//names.stream().filter(name->!name.equals("sam")).forEach(System.out::println);
		
		//names.stream().filter(name->!name.equals("sam")).map(User::new).forEach(System.out::println);;
		
		//List<User> usersList=names.stream().filter(name->!name.equals("sam")).map(User::new).collect(Collectors.toList());
		
		//long count=usersList.stream().mapToInt(User::getAge).count();
	

	public static void printsequence()
	{
		for(int i=54;i>0;i--)
		{
			i=i-4;
			System.out.print(i+" ");
		}
	}
	
	
}
