package com.practiseProgramms;

import org.testng.annotations.Test;

public class Fibonacci {
	
int n1=0,n2=1,sum=0;

public void printFibonacciInGivenRange(int range)
{
	for(int i=0;i<=range;i++)
	{
		System.out.print(sum+" ");
		n1=n2;
		n2=sum;
		sum=n1+n2;
	}
}
@Test
public void testFibonacci()
{
	printFibonacciInGivenRange(10);
}

public static void countNumberOfEvenAndOddDigitsinANumber(int num)
{
	int even=0,odd=0;
	while(num>0)
	{
		int rem=num%10;
		if(rem%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
		num=num/10;
	}
	System.out.println("even count is:"+even);
	System.out.println("odd count is:"+odd);
}

@Test
public void testCountNumberOfEvenAndOddDigitsinANumber()
{
	countNumberOfEvenAndOddDigitsinANumber(20987);
}
}