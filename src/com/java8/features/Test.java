package com.java8.features;

@FunctionalInterface
interface Test {

	public default void test()
	{
		System.out.println("hello from test interface");
	}
	
	public void test2();
	
	public static void test3()
	{
		System.out.println("hello from test interface test3 method");
	}
}
