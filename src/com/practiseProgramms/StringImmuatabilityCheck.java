package com.practiseProgramms;

import org.testng.annotations.Test;

public class StringImmuatabilityCheck {

	@Test
	public void proveStringsAreImmutable()
	{
		String s1="Java";
		String s2="Java";
		if(s1==s2)
		{
			System.out.println("both s1 and s2 objects are pointing to Java object");
		}
		s1.concat(s2);
		if(s1==s2)
		{
			System.out.println("both s1 and s2 objects are still pointing to Java object");
		}
		s2="Hello";
		if(s1==s2)
		{
			System.out.println("both s1 and s2 objects are pointing to Java object");
		}
		else
		{
			System.out.println("both s1 and s2 objects are pointing to different object");
		}
	}
}
