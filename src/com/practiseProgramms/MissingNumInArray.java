package com.practiseProgramms;

import org.testng.annotations.Test;

public class MissingNumInArray {

	@Test
	public static void missingNumInArray()
	{
		int arr[]= {1,2,3,4,6,7,8,9,10};
		int sum=0;
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=1;i<=arr.length+1;i++)
		{
			total=total+i;
		}
		System.out.println("missing num is :"+(total-sum));
	}
	
	@Test
	public static void maxNumInArray()
	{
		int arr[]= {99,9,88,789};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("max num is:"+max);
	}
	
	@Test
	public static void minNumInArray()
	{
		int arr[]= {99,9,88,789,-1,-789};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("max num is:"+min);
	}
	
}
