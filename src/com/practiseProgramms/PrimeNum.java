package com.practiseProgramms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNum {

	@Test
	public static void verifyPrimeNumInGivenRange()
{
		int num=0;
		//scanner class object creation
				Scanner sc=new Scanner(System.in);
				//input from user
				System.out.print("Enter Starting Number : ");
				int start = sc.nextInt();
				System.out.print("Enter Ending Number : ");
				int end = sc.nextInt();
				System.out.println("Prime numbers between "+start+" and "+end+" are : ");
				//loop for finding and printing all prime numbers between given range
				for(int i=start;i<=end;i++)
				{
					int count=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
							count++;
					}
					if(count==2)
					{
						num++;
						System.out.print(i+" ");
					}
				}
				System.out.println("total num of prime num's are: "+num);
				//closing scanner class(not mandatory but good practice)
				sc.close();	 
}
	
}
