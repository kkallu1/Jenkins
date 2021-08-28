package com.practiseProgramms;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class SortingArraysUsingInBuiltMethods {

	@Test
	public void sortStringsInAscOrder()
	{
		String []a= {"java","selenium","appium","c"};
		//Arrays.sort(a);
		Arrays.parallelSort(a);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
	
	@Test
	public void sortStringsInDescOrder()
	{
		String []a= {"java","selenium","appium","c"};
		//Arrays.sort(a);
		Arrays.parallelSort(a,Collections.reverseOrder());
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}
